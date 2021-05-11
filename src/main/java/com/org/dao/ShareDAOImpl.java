package com.org.dao;

import java.util.ArrayList;
import java.util.List;

import com.org.model.ShareVO;

public class ShareDAOImpl implements ShareDAO {

	public List<ShareVO> getAllPlayers() {

		List<ShareVO>  listOfShare= new ArrayList<ShareVO>();
		ShareVO s1 = new ShareVO("Wheels", 1.1f, "22-06-2018", "08-08-2018");
		listOfShare.add(s1);
		ShareVO s2 = new ShareVO("Borosil Glass", 3.1f, "18-06-2018", "02-08-2018");
		listOfShare.add(s2);
		ShareVO s3 = new ShareVO("MM Forgings", 1.1f, "28-05-2018", "18-07-2018");
		listOfShare.add(s3);
		ShareVO s4 = new ShareVO("Ashoka Buildcon", 1.2f, "29-05-2018", "12-07-2018");
		listOfShare.add(s4);
		ShareVO s5 = new ShareVO("General Insuran", 1.1f, "25-05-2018", "12-07-2018");
		listOfShare.add(s5);
		ShareVO s6 = new ShareVO("Minda Ind", 2.1f, "22-05-2018", ",11-07-2018");
		listOfShare.add(s6);
		ShareVO s7 = new ShareVO("City Union Bank", 1.10f, "24-05-2018", "10-07-2018");
		listOfShare.add(s7);
		ShareVO s8 = new ShareVO("Srestha Finvest", 1.10f, "11-05-2018", "06-07-2018");
		listOfShare.add(s8);
		return listOfShare;
	}

}
