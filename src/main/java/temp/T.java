package temp;


import dao.SimpleDao;

public class T {
    void m1() {
        System.out.println(getClass().getSimpleName() + ": m1");
        SimpleDao dao = new SimpleDao();
        dao.read();
    }
}
