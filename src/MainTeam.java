
import java.util.ArrayList;

public class MainTeam {

    public static void main(String[] args) {

        ArrayList<Team> list = new ArrayList<>();

        Team m1 = new Team();
        m1.setName("Kevin");
        m1.setTeam("Hore");
        m1.setUmur(18);
        m1.setPenampilan(50);
        m1.setSuara(60);
        m1.setAttitude(70);
        list.add(m1);

        Team m2 = new Team();
        m2.setName("Romero");
        m2.setTeam("Halo");
        m2.setUmur(18);
        m2.setPenampilan(70);
        m2.setSuara(80);
        m2.setAttitude(90);
        list.add(m2);

        Team m3 = new Team();
        m3.setName("Bambang");
        m3.setTeam("Hai");
        m3.setUmur(18);
        m3.setPenampilan(10);
        m3.setSuara(20);
        m3.setAttitude(35);
        list.add(m3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("============= MEMBER LIST =============");
            System.out.println("Nama\t: " + list.get(i).getName());
            System.out.println("Tim\t: " + list.get(i).getTeam());
            System.out.println("Umur\t: " + list.get(i).getUmur());
            System.out.println("Nilai\t: " + list.get(i).getNilai());
            System.out.println("");
        }
    }

}
