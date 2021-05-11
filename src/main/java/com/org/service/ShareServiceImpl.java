package com.org.service;

 
import java.util.ArrayList;
import java.util.List;

import com.org.dao.ShareDAO;
import com.org.dao.ShareDAOImpl;
import com.org.model.ShareVO;
 
 
public class ShareServiceImpl implements ShareService
{
  
 
    
    public List<ShareVO> getAllShares() 
    {
         List<ShareVO> shareList= new ArrayList<ShareVO>();
         ShareDAO shareDAO=new ShareDAOImpl();
 
            shareList=shareDAO.getAllPlayers();
        
        return shareList;
    }
    
}