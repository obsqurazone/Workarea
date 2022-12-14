package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.LoginPage;
import ElementRepository.ManageCodTab;
import ElementRepository.ManageExpense;
import Utilities.GeneralUtilities;
import constants.Constant;

public class ManageCodTest extends BaseClass {

	ManageCodTab mc;
	LoginPage lp;
	GeneralUtilities go = new GeneralUtilities();

	@Test
	public void checkboxValidation() {
		lp = new LoginPage(driver);
		mc = new ManageCodTab(driver);
		lp.presteps();
		mc.clickManagaCodTab();

		Boolean actual = mc.checkRadioButtonSelected();
		Assert.assertTrue(actual, Constant.selectionCmd);

	}

}
