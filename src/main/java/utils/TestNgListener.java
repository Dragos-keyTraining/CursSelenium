package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	Log.info("++++++++Started method: "+ result.getName()+"++++++");	
	Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	String timestamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	Log.info("++++++++Started time: "+ timestamp+"+++++++++++++++");	

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.info("++++++++End method: "+ result.getName()+"++++++");	
		Log.info("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		String timestamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.info("++++++++Finish time: "+ timestamp+"+++++++++++++++");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		Log.error("++++++++Failed method: "+ result.getName()+"++++++");	
		Log.error("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		String timestamp =  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Log.error("++++++++Started time: "+ timestamp+"+++++++++++++++");
		Log.error(result.getThrowable());
	}
	
	

}
