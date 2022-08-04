package specified;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class Specified1v1noInterest {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1));
            Page page = browser.newPage();
            page.navigate("http://localhost:3333/");

            // Click input[name="username"]
            page.click("input[name=\"username\"]");

            // Fill input[name="username"]
            page.fill("input[name=\"username\"]", "hmcts.civil+organisation.1.solicitor.1@gmail.com");

            // Press Tab
            page.press("input[name=\"username\"]", "Tab");

            // Fill input[name="password"]
            page.fill("input[name=\"password\"]", "Password12!");

            // Press Enter
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases"), () ->
            page.waitForNavigation(() -> {
                page.press("input[name=\"password\"]", "Enter");
            });
            // assert page.url().equals("http://localhost:3333/");

            // Click text=Create case
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-filter"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Create case");
            });

            // Select CREATE_CLAIM_SPEC
            page.selectOption("select[name=\"event\"]", "CREATE_CLAIM_SPEC");

            // Click text=Start
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECCheckList"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Start");
            });


            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECEligibility"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECReferences"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[type="text"]
            page.click("input[type=\"text\"]");

            // Fill input[type="text"]
            page.fill("input[type=\"text\"]", "Mark");

            // Press Tab
            page.press("input[type=\"text\"]", "Tab");

            // Fill #solicitorReferences_respondentSolicitor1Reference
            page.fill("#solicitorReferences_respondentSolicitor1Reference", "Steve");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimant"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            page.click("#applicant1_type-INDIVIDUAL");

            // Click #applicant1_individualFirstName
            page.click("#applicant1_individualFirstName");

            // Fill #applicant1_individualFirstName
            page.fill("#applicant1_individualFirstName", "Mark");

            // Press Tab
            page.press("#applicant1_individualFirstName", "Tab");

            // Fill #applicant1_individualLastName
            page.fill("#applicant1_individualLastName", "Drummond");

            // Press Tab
            page.press("#applicant1_individualLastName", "Tab");

            // Fill input[name="individualDateOfBirth-day"]
            page.fill("input[name=\"individualDateOfBirth-day\"]", "02");

            // Press Tab
            page.press("input[name=\"individualDateOfBirth-day\"]", "Tab");

            // Fill input[name="individualDateOfBirth-month"]
            page.fill("input[name=\"individualDateOfBirth-month\"]", "02");

            // Press Tab
            page.press("input[name=\"individualDateOfBirth-month\"]", "Tab");

            // Fill input[name="individualDateOfBirth-year"]
            page.fill("input[name=\"individualDateOfBirth-year\"]", "1990");

            // Click text=I can't enter a UK postcode
            page.click("text=I can't enter a UK postcode");

            // Click text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type="text"]
            page.click("text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type=\"text\"]");

            // Fill text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type="text"]
            page.fill("text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type=\"text\"]", "Random address");

            // Click #applicant1_primaryAddress__detailPostCode
            page.click("#applicant1_primaryAddress__detailPostCode");

            // Fill #applicant1_primaryAddress__detailPostCode
            page.fill("#applicant1_primaryAddress__detailPostCode", "WC1N 2LD");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECAddAnotherClaimant"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #addApplicant2_No
            page.click("#addApplicant2_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECNotifications"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="applicantSolicitor1CheckEmail_correct"]
            page.click("input[name=\"applicantSolicitor1CheckEmail_correct\"]");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimantSolicitorOrganisation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.click("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]");

            // Fill text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.fill("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]", "civil");

            // Click text=38 Delisle RoadLondonLondonSE28 0JESelect >> a
            page.click("text=38 Delisle RoadLondonLondonSE28 0JESelect >> a");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECspecCorrespondenceAddress"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #specApplicantCorrespondenceAddressRequired_No
            page.click("#specApplicantCorrespondenceAddressRequired_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECDefendant"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #respondent1_individual
            page.click("#respondent1_type-INDIVIDUAL");

            // Click #respondent1_individualFirstName
            page.click("#respondent1_individualFirstName");

            // Fill #respondent1_individualFirstName
            page.fill("#respondent1_individualFirstName", "James");

            // Press Tab
            page.press("#respondent1_individualFirstName", "Tab");

            // Fill #respondent1_individualLastName
            page.fill("#respondent1_individualLastName", "Smith");

            // Press Tab
            page.press("#respondent1_individualLastName", "Tab");

            // Click text=I can't enter a UK postcode
            page.click("text=I can't enter a UK postcode");

            // Click text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type="text"]
            page.click("text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type=\"text\"]");

            // Fill text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type="text"]
            page.fill("text=Building and StreetAddress Line 2 (Optional)Address Line 3 (Optional)Town or Cit >> input[type=\"text\"]", "Respondent fake address");

            // Click #respondent1_primaryAddress__detailPostCode
            page.click("#respondent1_primaryAddress__detailPostCode");

            // Fill #respondent1_primaryAddress__detailPostCode
            page.fill("#respondent1_primaryAddress__detailPostCode", "WC1N 2LD");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECLegalRepresentation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="specRespondent1Represented"]
            page.click("input[name=\"specRespondent1Represented\"]");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECDefendantSolicitorOrganisation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });


            // Click input[name="respondent1OrgRegistered"]
            page.click("input[name=\"respondent1OrgRegistered\"]");

            // Click text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.click("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]");

            // Fill text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.fill("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]", "civil");

            // Click text=Civil - Organisation 329, SEATON DRIVENORTHAMPTONNN3 9SSSelect >> a
            page.click("text=Civil - Organisation 329, SEATON DRIVENORTHAMPTONNN3 9SSSelect >> a");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECDefendantSolicitorEmail"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[type="email"]
            page.click("input[type=\"email\"]");

            // Fill input[type="email"]
            page.fill("input[type=\"email\"]", "hmcts.civil+organisation.3.solicitor.1@gmail.com");

            // Click button:has-text("Continue")
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECspecRespondentCorrespondenceAddress"), () ->
            page.waitForNavigation(() -> {
                page.click("button:has-text(\"Continue\")");
            });


            // Click #specRespondentCorrespondenceAddressRequired_No
            page.click("#specRespondentCorrespondenceAddressRequired_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECAddAnotherDefendant"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });


            // Click #addRespondent2_No
            page.click("#addRespondent2_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECDetails"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click textarea
            page.click("textarea");

            // Fill textarea
            page.fill("textarea", "Stuff happened");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECUploadClaimDocument"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });


            // Click text=Add manually
            page.click("text=Add manually");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimTimeline"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Add new
            page.click("text=Add new");

            // Click input[name="timelineDate-day"]
            page.click("input[name=\"timelineDate-day\"]");

            // Fill input[name="timelineDate-day"]
            page.fill("input[name=\"timelineDate-day\"]", "20");

            // Press Tab
            page.press("input[name=\"timelineDate-day\"]", "Tab");

            // Fill input[name="timelineDate-month"]
            page.fill("input[name=\"timelineDate-month\"]", "02");

            // Press Tab
            page.press("input[name=\"timelineDate-month\"]", "Tab");

            // Fill input[name="timelineDate-year"]
            page.fill("input[name=\"timelineDate-year\"]", "2010");

            // Press Tab
            page.press("input[name=\"timelineDate-year\"]", "Tab");

            // Fill textarea
            page.fill("textarea", "not a lot");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECEvidenceList"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Add new
            page.click("text=Add new");

            // Select 1: CONTRACTS_AND_AGREEMENTS
            page.selectOption("select", "1: CONTRACTS_AND_AGREEMENTS");

            // Click textarea
            page.click("textarea");

            // Fill textarea
            page.fill("textarea", "contract onfo");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimAmount"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });


            // Click text=Add new
            page.click("text=Add new");

            // Click input[type="text"]
            page.click("input[type=\"text\"]");

            // Fill input[type="text"]
            page.fill("input[type=\"text\"]", "Cash Money");

            // Click input[name="claimAmountBreakup_0_claimAmount"]
            page.click("input[name=\"claimAmountBreakup_0_claimAmount\"]");

            // Fill input[name="claimAmountBreakup_0_claimAmount"]
            page.fill("input[name=\"claimAmountBreakup_0_claimAmount\"]", "8888");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimAmountDetails"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECClaimInterest"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #claimInterest_No
            page.click("#claimInterest_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECInterestSummary"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECPbaNumber"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            page.press("body:has-text(\"Skip to main contentManage CasesSign outCase listCreate caseFind case beta This \")", "Tab");
            // Press ArrowDown
            page.press("select", "ArrowDown");
            // Press Tab
            page.press("select", "Tab");
            // Press Tab
            page.press("summary:has-text(\"Pay with another PBA\")", "Tab");
            // Press Tab
            page.press("text=Previous", "Tab");
            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECPaymentReference"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/CREATE_CLAIM_SPECStatementOfTruth"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[type="text"]
            page.click("input[type=\"text\"]");

            // Fill input[type="text"]
            page.fill("input[type=\"text\"]", "Mark");

            // Press Tab
            page.press("input[type=\"text\"]", "Tab");

            // Fill #uiStatementOfTruth_role
            page.fill("#uiStatementOfTruth_role", "test");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM_SPEC/submit"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

        }
    }

}
