public class Main {
    public static void main(String[] args) {
        // Реализовать программу, в которой задается граф из 10 вершин.
        // Задать ребра и найти кратчайший путь с помощью поиска в ширину.
        //
        // рисунок:
        // https://graphonline.ru/tmp/saved/xb/xbDbAUwkLpYQjHPs.png
        int vertCount = 10; // количество вершин
        int startVert = 0; // вершина старта
        int endVert = 9; // вершина окончания
        Graph graph = new Graph(vertCount);
        graph.addEdge(0,2);
        graph.addEdge(0,1);
        graph.addEdge(2,1);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(4,6);
        graph.addEdge(4,5);
        graph.addEdge(6,5);
        graph.addEdge(5,7);
        graph.addEdge(7,8);
        graph.addEdge(7,9);
        graph.addEdge(8,9);
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, startVert);
        System.out.println("Наличие пути: " + bfp.hasPathTo(endVert));
        System.out.println("Список вершин: " + bfp.pathTo(endVert));
        System.out.println("Длина пути: " + bfp.lengthTo(endVert) + " вершин.");
    }
}
