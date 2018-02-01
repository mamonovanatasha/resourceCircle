package dal;


import dao.Resource;

import java.util.List;

/**
 * Created by Наташа on 20.01.2018.
 */
public interface ResourceDao {
void save (Resource entity);

    List<Resource> findAll();


}
