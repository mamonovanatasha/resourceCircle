package dal.impl;

import dal.ResourceDao;
import dao.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Наташа on 20.01.2018.
 */
@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

    public void save(Resource entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(entity);

        tx.commit();
        session.close();

    }

    @SuppressWarnings("unchecked")
    public List<Resource> findAll() {
            Session session = this.sessionFactory.openSession();
            List<Resource> resultList = session.createQuery("from Resource").list();
            session.close();
            return resultList;
        }
}
