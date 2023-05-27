import com.example.project.bean.Employees;
import com.example.project.utils.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

 class Main {

    public static void main(String[] args) {
        Employees employees1 = new Employees();
        employees1.setEmployee_id("1");
        employees1.setFirst_name("Sheetal");
        employees1.setLast_name("Agarwal");
        employees1.setEmail("sheetal0797@gmail.com");
        employees1.setPassword("1234");
        employees1.setDepartment("outreach");
        employees1.setPhotograph_path("null");
        Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        Employees e1=new Employees("2","abc","abc","abc@gmail.com","abc","account","null");
        session.save(employees1);
        session.save(e1);
        tx.commit();
    }
}