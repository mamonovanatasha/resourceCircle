package logic;

import dal.ContributionDao;
import dal.EventDao;
import dal.RegularEventDao;
import dal.ResourceDao;
import dao.Contribution;
import dao.RegularEvent;
import dao.Resource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Наташа on 20.01.2018.
 */
public class MainLogic {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //ctrl+alt +v создание переменной
        ResourceDao resourceDao = context.getBean(ResourceDao.class);
        ContributionDao contributionDao = context.getBean(ContributionDao.class);
        EventDao eventDao = context.getBean(EventDao.class);
        RegularEventDao regularEventDao = context.getBean(RegularEventDao.class);

//        initDataBase(resourceDao, contributionDao);




        context.close();

    }

    private static void initDataBase(ResourceDao resourceDao, ContributionDao contributionDao) {
        // shift + F6 переименовать переменную везде
        Resource resource1 = new Resource();
        resource1.setName("Учеба");
        resourceDao.save(resource1);

        Resource resource2 = new Resource();
        resource2.setName("Семья");
        resourceDao.save(resource2);

        Resource resource3 = new Resource();
        resource3.setName("Здоровье");
        resourceDao.save(resource3);

        Resource resource4 = new Resource();
        resource4.setName("Работа");
        resourceDao.save(resource4);

        Resource resource5 = new Resource();
        resource5.setName("Друзья");
        resourceDao.save(resource5);

        Contribution contribution1 = new Contribution();
        contribution1.setResource(resource1);
        contribution1.setName("фх");
        contribution1.setFactor(40L);  //long --> int  L
        contributionDao.save(contribution1);

        Contribution contribution2 = new Contribution();
        contribution2.setResource(resource1);
        contribution2.setName("java");
        contribution2.setFactor(80L);  //long --> int  L
        contributionDao.save(contribution2);

        Contribution contribution3 = new Contribution();
        contribution3.setResource(resource2);
        contribution3.setName("звонок маме");
        contribution3.setFactor(20L);  //long --> int  L
        contributionDao.save(contribution3);

        Contribution contribution4 = new Contribution();
        contribution4.setResource(resource2);
        contribution4.setName("рыбалка с папой");
        contribution4.setFactor(5L);  //long --> int  L
        contributionDao.save(contribution4);

        Contribution contribution5 = new Contribution();
        contribution5.setResource(resource3);
        contribution5.setName("зарядка");
        contribution5.setFactor(30L);  //long --> int  L
        contributionDao.save(contribution5);

        Contribution contribution6 = new Contribution();
        contribution6.setResource(resource3);
        contribution6.setName("обследование");
        contribution6.setFactor(40L);  //long --> int  L
        contributionDao.save(contribution6);

        Contribution contribution7 = new Contribution();
        contribution7.setResource(resource3);
        contribution7.setName("правильное питание");
        contribution7.setFactor(70L);  //long --> int  L
        contributionDao.save(contribution7);

        Contribution contribution8 = new Contribution();
        contribution8.setResource(resource4);
        contribution8.setName("чтение проф.литературы");
        contribution8.setFactor(30L);  //long --> int  L
        contributionDao.save(contribution8);

        Contribution contribution9 = new Contribution();
        contribution9.setResource(resource4);
        contribution9.setName("курсы повышение квалификации");
        contribution9.setFactor(100L);  //long --> int  L
        contributionDao.save(contribution9);

        Contribution contribution10 = new Contribution();
        contribution10.setResource(resource5);
        contribution10.setName("встреча с друзьями");
        contribution10.setFactor(30L);  //long --> int  L
        contributionDao.save(contribution10);
    }
}
