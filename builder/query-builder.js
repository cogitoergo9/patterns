const Queue = require("./queue");

class QueryBuilder{

    /**
     * Select fields for query
     * @param {*} fields 
     * @returns fields
     */
    select(fields){
        this.fields = fields;
        return this;
    }
    
    /**
     * Choose the tables and was is necessary use joins too
     * @param {*} tables 
     * @returns tables
     */
    from(tables){
        this.tables = tables;
        return this;
    }

    /**
     * Add conditions of query
     * @param {*} conditions 
     * @returns conditions
     */
    where(conditions){
        this.conditions = conditions;
        return this;
    }

    /**
     * Add parameters for the conditions
     * @param  {...any} param 
     * @returns parameters
     */
    setParameters(...param){
        let queue = new  Queue();

        param.forEach(e=>{
            queue.enqueue(e);
        });
        
        this.param = queue;
        return this;
    }

    //TODO
    limit(rowNumbers){
        this.rowNumbers = rowNumbers;
        return this;
    }

    orderBy(order){
        this.order = order;
        return this;

    }

    build(){   

        if(this.param){           
            while(!this.param.isEmpty()){
              this.conditions = this.conditions.replace("?",this.param.front());
              this.param.dequeue();
            } 
        }
        
       return `SELECT ${this.fields} FROM ${this.tables} WHERE ${this.conditions} ${this.order?this.order:''} WITH UR`;
    }

}


module.exports = QueryBuilder;