EProduct:-
import java.math.BigDecimal;
import java.util.Date;

public class EProduct {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        
        public EProduct() {
                
        }
        public EProduct(long id, String name, BigDecimal price, Date dateAdded) {
                this.ID = id;
                this.name = name;
                this.price = price;
                this.dateAdded = dateAdded;
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        
        
}
Hibernate Util:-
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

        private static final SessionFactory sessionFactory;

        static {
                try {
                        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                        .configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        sessionFactory = metaData.getSessionFactoryBuilder().build();
                } catch (Throwable th) {
                        throw new ExceptionInInitializerError(th);
                }
        }

        public static SessionFactory getSessionFactory() {
                return sessionFactory;
        }
}




ListProduct:-


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.hibernate.SessionFactory;


@WebServlet("/ListProduct")
public class ListProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         try {
                SessionFactory factory = HibernateUtil.getSessionFactory();
                
                Session session = (Session) factory.openSession();
                // using HQL
                List<EProduct> list = ((org.hibernate.Session) session).createQuery("from EProduct").list();
                
                session.close();
                
                 PrintWriter out = response.getWriter();
                 out.println("<html><body>");
                 out.println("<b>Product Listing</b><br>");
                 for(EProduct p: list) {
                         out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                         ", Price: " + String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
                 }
                 
             out.println("</body></html>");
             
             
         } catch (Exception ex) {
                 throw ex;
         }
            
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
}

}

