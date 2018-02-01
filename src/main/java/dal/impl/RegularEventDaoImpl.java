package dal.impl;

import dal.EventDao;
import dal.RegularEventDao;
import dao.Event;
import dao.RegularEvent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by Наташа on 20.01.2018.
 */
@Repository
public class RegularEventDaoImpl implements RegularEventDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;

    public void save(RegularEvent entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(entity);

        tx.commit();
        session.close();

    }
}
