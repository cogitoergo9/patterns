class Queue{

    constructor(){
        this.items = [];
    }

    /**
     * Adding element to the queue
     * @param {*} element new data
     */
    enqueue(element){    
     this.items.push(element);
    }

    /**
     * Is Empty return true
     * @returns Boolean
     */
    isEmpty(){
        return this.items.length === 0;
    }    

    /**
     * Remove first element
     * @returns return queue
     */
    dequeue(){
        if(this.isEmpty())
            return "underflow";

        return this.items.shift()
    }

    /**
     * Get first element of queue
     * @returns 
     */
    front(){
        if(this.isEmpty())
            return "No elements in the Queue";
        return this.items[0];
    }

    /**
     * Retrieve length of queue
     * @returns Int with size
     */
    size(){
        return this.items.length;
    }


}

module.exports = Queue;