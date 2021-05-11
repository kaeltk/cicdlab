import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.org.model.ShareVO;
import com.org.service.ShareService;
import com.org.service.ShareServiceImpl;

public class ShareTestCase {
// test for local repository
	@Test
	public void getShareReportTest()
	{
		ShareService obj = new ShareServiceImpl();
		
		List<ShareVO> listOfShare=obj.getAllShares();
		System.out.println("test executed");
	assertNotNull(listOfShare);
		
	}
	
	
}
