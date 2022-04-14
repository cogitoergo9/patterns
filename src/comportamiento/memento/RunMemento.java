package comportamiento.memento;

public class RunMemento {
    public static void main(String[] args) {
        Carataker carataker = new Carataker();
        Article article = new Article("Cantiflas", "Ahí esta el detalle");
        article.setText(article.getText()+ " es una película cómica");
        System.out.println(article.getText());
        carataker.addMemento(article.createMemento());

        article.setText(article.getText()+ " y protoganizada por Mario Moreno Cantiflas");
        System.out.println(article.getText());
        carataker.addMemento(article.createMemento());

        article.setText(article.getText()+ " y Leonardo Di Caprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = carataker.getMemento(0);
        ArticleMemento memento2 = carataker.getMemento(1);

        article.restoreMemento(memento1);
        System.out.println(article.getText());
        article.restoreMemento(memento2);
        System.out.println(article.getText());

        article.setText(article.getText()+ " y otros actores");
        System.out.println(article.getText());

    }
}
