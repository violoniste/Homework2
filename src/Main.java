public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("task1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("task2");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("task3");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3;
        cat = cat - 3;
        paper = paper - 3;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("task4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("task5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("task6");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersWeightTotal = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров " + boxersWeightTotal);
        var boxersWeightDelta = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + boxersWeightDelta);
    }

    public static void task7 () {
        System.out.println("task7");

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var boxersWeightDelta1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + boxersWeightDelta1);
        var boxersWeightDelta2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе " + boxersWeightDelta2);
    }

    public static void task8 () {
        System.out.println("task8");

        var hoursTotal = 640;
        var hoursPerWorker = 8;
        var totalWorkers = hoursTotal / hoursPerWorker;
        System.out.println("Всего работников в компании — " + totalWorkers);
        totalWorkers = totalWorkers + 94;
        hoursTotal = totalWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkers + "  человек, то всего " + hoursTotal + " часов работы может быть поделено между сотрудниками");
    }
}