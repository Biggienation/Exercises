package Vecka4;

public final class Uppgift1 {
    public static void main(String[] args) {
        Ball a = new Football("adiddas");
        Ball b = new Baseball("Nike");

        System.out.println(a.getBrandName());
        System.out.println(b.getBrandName());
        System.out.println();
        a.toss();
        b.toss();
        a.bounce();
        b.bounce();

    }
}
interface Tossable {
    void toss();
}

class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void bounce(){
        System.out.println("Bounce Ball");
    }

    public void toss() {
        System.out.println("Toss Ball");
    }

}

class Rock implements Tossable {
    public void toss() {
        System.out.println("Toss Rock");
    }
}

class Baseball extends Ball {
    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Tosss Baseball");
    }

    @Override
    public void bounce() {
        System.out.println("Bounce Baseball");
    }
}

class Football extends Ball {
    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Tosss Football");
    }
    @Override
    public void bounce() {
        System.out.println("Bounce Football");
    }

}
