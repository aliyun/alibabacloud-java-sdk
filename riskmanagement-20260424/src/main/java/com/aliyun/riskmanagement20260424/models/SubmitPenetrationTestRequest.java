// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class SubmitPenetrationTestRequest extends TeaModel {
    /**
     * <p>The list of assets.</p>
     * <blockquote>
     * <p>The array supports a maximum of 50 IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;AssetType&quot;:&quot;SLB&quot;,&quot;Ip&quot;:&quot;47.114.52.93&quot;}]</p>
     */
    @NameInMap("AssetList")
    public String assetList;

    /**
     * <p>Specifies whether a third-party testing service provider is used. Valid values:</p>
     * <ul>
     * <li><p>true: Yes.</p>
     * </li>
     * <li><p>false: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsThirdpartyTest")
    public Boolean isThirdpartyTest;

    /**
     * <p>The test content.</p>
     * <blockquote>
     * <p>The content must not exceed 500 characters. Provide detailed information to facilitate the approval process.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>security test</p>
     */
    @NameInMap("TestContent")
    public String testContent;

    /**
     * <p>The end time of the test.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-30</p>
     */
    @NameInMap("TestEndDate")
    public String testEndDate;

    /**
     * <p>The source IP addresses used for the test.</p>
     * <blockquote>
     * <p>A maximum of 50 IP addresses are supported. Separate multiple IP addresses with line breaks or commas (,). 0.0.0.0 indicates that all IP addresses are allowed. CIDR blocks are not supported, such as 140.168.0.0/16.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0</p>
     */
    @NameInMap("TestSourceIps")
    public String testSourceIps;

    /**
     * <p>The start date of the test.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-30</p>
     */
    @NameInMap("TestStartDate")
    public String testStartDate;

    /**
     * <p>The test steps.</p>
     * <blockquote>
     * <p>The content must not exceed 500 characters. Provide detailed information to facilitate the approval process.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("TestSteps")
    public String testSteps;

    /**
     * <p>The email address of the third-party tester.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123xxxxx@xx.com">123xxxxx@xx.com</a></p>
     */
    @NameInMap("ThirdpartyEmail")
    public String thirdpartyEmail;

    /**
     * <p>The mobile phone number of the third-party tester.</p>
     * 
     * <strong>example:</strong>
     * <p>177xxxxxx21</p>
     */
    @NameInMap("ThirdpartyMobile")
    public String thirdpartyMobile;

    /**
     * <p>The third-party tester.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("ThirdpartyTester")
    public String thirdpartyTester;

    public static SubmitPenetrationTestRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPenetrationTestRequest self = new SubmitPenetrationTestRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPenetrationTestRequest setAssetList(String assetList) {
        this.assetList = assetList;
        return this;
    }
    public String getAssetList() {
        return this.assetList;
    }

    public SubmitPenetrationTestRequest setIsThirdpartyTest(Boolean isThirdpartyTest) {
        this.isThirdpartyTest = isThirdpartyTest;
        return this;
    }
    public Boolean getIsThirdpartyTest() {
        return this.isThirdpartyTest;
    }

    public SubmitPenetrationTestRequest setTestContent(String testContent) {
        this.testContent = testContent;
        return this;
    }
    public String getTestContent() {
        return this.testContent;
    }

    public SubmitPenetrationTestRequest setTestEndDate(String testEndDate) {
        this.testEndDate = testEndDate;
        return this;
    }
    public String getTestEndDate() {
        return this.testEndDate;
    }

    public SubmitPenetrationTestRequest setTestSourceIps(String testSourceIps) {
        this.testSourceIps = testSourceIps;
        return this;
    }
    public String getTestSourceIps() {
        return this.testSourceIps;
    }

    public SubmitPenetrationTestRequest setTestStartDate(String testStartDate) {
        this.testStartDate = testStartDate;
        return this;
    }
    public String getTestStartDate() {
        return this.testStartDate;
    }

    public SubmitPenetrationTestRequest setTestSteps(String testSteps) {
        this.testSteps = testSteps;
        return this;
    }
    public String getTestSteps() {
        return this.testSteps;
    }

    public SubmitPenetrationTestRequest setThirdpartyEmail(String thirdpartyEmail) {
        this.thirdpartyEmail = thirdpartyEmail;
        return this;
    }
    public String getThirdpartyEmail() {
        return this.thirdpartyEmail;
    }

    public SubmitPenetrationTestRequest setThirdpartyMobile(String thirdpartyMobile) {
        this.thirdpartyMobile = thirdpartyMobile;
        return this;
    }
    public String getThirdpartyMobile() {
        return this.thirdpartyMobile;
    }

    public SubmitPenetrationTestRequest setThirdpartyTester(String thirdpartyTester) {
        this.thirdpartyTester = thirdpartyTester;
        return this;
    }
    public String getThirdpartyTester() {
        return this.thirdpartyTester;
    }

}
