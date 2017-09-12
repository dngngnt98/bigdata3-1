package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.IoTUserDao;
import bigdata3.domain.IoTUser;
import bigdata3.service.IoTUserService;

@Service
public class IoTUserServiceImpl implements IoTUserService {
  @Autowired IoTUserDao userDao;
  
  public List<IoTUser> list(int pageNo, int pageSize) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);
    
    return userDao.selectList(valueMap);
  }
  
  public IoTUser get(String email) {
    return userDao.selectOne(email);
  }
  
  public IoTUser getByEmailPassword(String email, String password) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("email", email);
    valueMap.put("password", password);
    
    return userDao.selectOneByEmailPassword(valueMap);
  }
  
  public void add(IoTUser user) {
    userDao.insert(user);
  }
  
  public void updateToken(IoTUser user) {
    userDao.updateToken(user);
  }
  
  public void remove(String email) {
    userDao.delete(email);
  }
}







