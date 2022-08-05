package damages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class Damages1v1 {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();

        {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
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


            // Select CREATE_CLAIM
            page.selectOption("select[name=\"event\"]", "CREATE_CLAIM");

            // Click text=Start
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMEligibility"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Start");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMReferences"), () ->
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
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMCourt"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[type="text"]
            page.click("input[type=\"text\"]");

            // Fill input[type="text"]
            page.fill("input[type=\"text\"]", "123");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimant"), () ->
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
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimantLitigationFriend"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #applicant1LitigationFriendRequired_No
            page.click("#applicant1LitigationFriendRequired_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMNotifications"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="applicantSolicitor1CheckEmail_correct"]
            page.click("input[name=\"applicantSolicitor1CheckEmail_correct\"]");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimantSolicitorOrganisation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimantSolicitorServiceAddress"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #applicantSolicitor1ServiceAddressRequired_No
            page.click("#applicantSolicitor1ServiceAddressRequired_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMAddAnotherClaimant"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #addApplicant2_No
            page.click("#addApplicant2_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMDefendant"), () ->
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
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMLegalRepresentation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="respondent1Represented"]
            page.click("input[name=\"respondent1Represented\"]");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMDefendantSolicitorOrganisation"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="respondent1OrgRegistered"]
            page.click("input[name=\"respondent1OrgRegistered\"]");

            // Click text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.click("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]");

            // Fill text=Search for an organisation You can only search for organisations already registe >> input[type="text"]
            page.fill("text=Search for an organisation You can only search for organisations already registe >> input[type=\"text\"]", "civi");

            // Click text=Civil - Organisation 329, SEATON DRIVENORTHAMPTONNN3 9SSSelect >> a
            page.click("text=Civil - Organisation 329, SEATON DRIVENORTHAMPTONNN3 9SSSelect >> a");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMDefendantSolicitorServiceAddress"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #respondentSolicitor1ServiceAddressRequired_No
            page.click("#respondentSolicitor1ServiceAddressRequired_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMDefendantSolicitorEmail"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[type="email"]
            page.click("input[type=\"email\"]");

            // Fill input[type="email"]
            page.fill("input[type=\"email\"]", "fake@email.com");


            // Press Enter
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMAddAnotherDefendant"), () ->
            page.waitForNavigation(() -> {
                page.press("input[type=\"email\"]", "Enter");
            });


            // Click #addRespondent2_No
            page.click("#addRespondent2_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimType"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Personal injury
            page.click("text=Personal injury");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMPersonalInjuryType"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click text=Road accident
            page.click("text=Road accident");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMDetails"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click textarea
            page.click("textarea");

            // Fill textarea
            page.fill("textarea", "car crash");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMuploadParticularsOfClaim"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click #uploadParticularsOfClaim_No
            page.click("#uploadParticularsOfClaim_No");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMClaimValue"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click input[name="claimValue_statementOfValueInPennies"]
            page.click("input[name=\"claimValue_statementOfValueInPennies\"]");

            // Fill input[name="claimValue_statementOfValueInPennies"]
            page.fill("input[name=\"claimValue_statementOfValueInPennies\"]", "2165");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMPbaNumber"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            // Click fieldset:has-text("Pay fee using Payment by Account (PBA) (Optional)YesNoClaim feeAmount to pay£115")
            page.click("fieldset:has-text(\"Pay fee using Payment by Account (PBA) (Optional)YesNoClaim feeAmount to pay£115\")");

            // Press Tab
            page.press("body:has-text(\"Skip to main content MyHMCTS Manage CasesSign outCase listCreate caseFind case b\")", "Tab");

            // Press ArrowDown
            page.press("select", "ArrowDown");

            // Press Tab
            page.press("select", "Tab");

            // Press Tab
            page.press("summary:has-text(\"Pay with another PBA\")", "Tab");

            // Press Tab
            page.press("text=Previous", "Tab");

            // Press Enter
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMPaymentReference"), () ->
            page.waitForNavigation(() -> {
                page.press("text=Continue", "Enter");
            });

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/CREATE_CLAIMStatementOfTruth"), () ->
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
            page.fill("#uiStatementOfTruth_role", "Test");

            // Click text=Continue
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("http://localhost:3333/cases/case-create/CIVIL/CIVIL/CREATE_CLAIM/submit"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Continue");
            });

            page.pause();
        }
    }
}
