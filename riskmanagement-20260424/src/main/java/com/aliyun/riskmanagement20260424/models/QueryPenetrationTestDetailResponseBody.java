// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryPenetrationTestDetailResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Success.</li>
     * <li><strong>Other values (400 and 500)</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response content.</p>
     */
    @NameInMap("Data")
    public QueryPenetrationTestDetailResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.                               </li>
     * <li><strong>false</strong>: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPenetrationTestDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPenetrationTestDetailResponseBody self = new QueryPenetrationTestDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPenetrationTestDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPenetrationTestDetailResponseBody setData(QueryPenetrationTestDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPenetrationTestDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryPenetrationTestDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPenetrationTestDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPenetrationTestDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPenetrationTestDetailResponseBodyData extends TeaModel {
        /**
         * <p>The application time.</p>
         * 
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("ApplyTime")
        public Long applyTime;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: public IP address in a VPC.</li>
         * <li><strong>SLB</strong>: load balancing.</li>
         * <li><strong>ECS</strong>: public IP address in the classic network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The unique identity of the application record.</p>
         * <blockquote>
         * <p>This field is of the Long type. Precision loss may occur during the procedure to serialize or deserialize the numeric sequence. Ensure that the value does not exceed 9007199254740991.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2387</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>IP</p>
         * 
         * <strong>example:</strong>
         * <p>47.113.186.91</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Indicates whether the test is performed by a third-party service provider. Valid values:</p>
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
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>early_end</strong>: The user applied for early termination.</li>
         * <li><strong>expired</strong>: The authorization has expired.</li>
         * <li><strong>auditing</strong>: Under review.</li>
         * <li><strong>approved</strong>: Approved.</li>
         * <li><strong>rejected</strong>: Rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>early_end</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The test content.</p>
         * <blockquote>
         * <ul>
         * <li>Maximum 500 characters. Provide detailed information to increase the chance of passing the review.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>security test</p>
         */
        @NameInMap("TestContent")
        public String testContent;

        /**
         * <p>The test end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("TestEndDate")
        public Long testEndDate;

        /**
         * <p>The source IP addresses used for the test.</p>
         * <blockquote>
         * <p>A maximum of 50 IP addresses are supported. Separate multiple IP addresses with line breaks or commas (,). Specify 0.0.0.0 to allow all IP addresses. CIDR blocks are not supported, such as 140.168.0.0/16.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("TestSourceIps")
        public String testSourceIps;

        /**
         * <p>The test start date.</p>
         * 
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("TestStartDate")
        public Long testStartDate;

        /**
         * <p>The test steps.</p>
         * <blockquote>
         * <p>Maximum 500 characters. Provide detailed information to increase the chance of passing the review.</p>
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
         * <p><a href="mailto:12312@xxx.com">12312@xxx.com</a></p>
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

        public static QueryPenetrationTestDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPenetrationTestDetailResponseBodyData self = new QueryPenetrationTestDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPenetrationTestDetailResponseBodyData setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public QueryPenetrationTestDetailResponseBodyData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public QueryPenetrationTestDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryPenetrationTestDetailResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryPenetrationTestDetailResponseBodyData setIsThirdpartyTest(Boolean isThirdpartyTest) {
            this.isThirdpartyTest = isThirdpartyTest;
            return this;
        }
        public Boolean getIsThirdpartyTest() {
            return this.isThirdpartyTest;
        }

        public QueryPenetrationTestDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPenetrationTestDetailResponseBodyData setTestContent(String testContent) {
            this.testContent = testContent;
            return this;
        }
        public String getTestContent() {
            return this.testContent;
        }

        public QueryPenetrationTestDetailResponseBodyData setTestEndDate(Long testEndDate) {
            this.testEndDate = testEndDate;
            return this;
        }
        public Long getTestEndDate() {
            return this.testEndDate;
        }

        public QueryPenetrationTestDetailResponseBodyData setTestSourceIps(String testSourceIps) {
            this.testSourceIps = testSourceIps;
            return this;
        }
        public String getTestSourceIps() {
            return this.testSourceIps;
        }

        public QueryPenetrationTestDetailResponseBodyData setTestStartDate(Long testStartDate) {
            this.testStartDate = testStartDate;
            return this;
        }
        public Long getTestStartDate() {
            return this.testStartDate;
        }

        public QueryPenetrationTestDetailResponseBodyData setTestSteps(String testSteps) {
            this.testSteps = testSteps;
            return this;
        }
        public String getTestSteps() {
            return this.testSteps;
        }

        public QueryPenetrationTestDetailResponseBodyData setThirdpartyEmail(String thirdpartyEmail) {
            this.thirdpartyEmail = thirdpartyEmail;
            return this;
        }
        public String getThirdpartyEmail() {
            return this.thirdpartyEmail;
        }

        public QueryPenetrationTestDetailResponseBodyData setThirdpartyMobile(String thirdpartyMobile) {
            this.thirdpartyMobile = thirdpartyMobile;
            return this;
        }
        public String getThirdpartyMobile() {
            return this.thirdpartyMobile;
        }

        public QueryPenetrationTestDetailResponseBodyData setThirdpartyTester(String thirdpartyTester) {
            this.thirdpartyTester = thirdpartyTester;
            return this;
        }
        public String getThirdpartyTester() {
            return this.thirdpartyTester;
        }

    }

}
