package service;

import dal.ResourceDao;
import dao.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Наташа on 21.01.2018.
 */
@Service
public class ResourceService {
@Autowired
private ResourceDao resourceDao;
    public List<Resource> findAllResources() {
        return resourceDao.findAll();

    }
}
