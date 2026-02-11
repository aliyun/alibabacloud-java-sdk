// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestModelResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public TestModelResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TestModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestModelResponseBody self = new TestModelResponseBody();
        return TeaModel.build(map, self);
    }

    public TestModelResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TestModelResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TestModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestModelResponseBody setResultObject(TestModelResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public TestModelResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public TestModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestModelResponseBodyResultObjectTestResult extends TeaModel {
        /**
         * <p>Actual output.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("ActualResult")
        public String actualResult;

        /**
         * <p>Whether it is consistent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Consistency")
        public Boolean consistency;

        /**
         * <p>Test output.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("TestResult")
        public String testResult;

        /**
         * <p>Training output.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("TrainResult")
        public String trainResult;

        public static TestModelResponseBodyResultObjectTestResult build(java.util.Map<String, ?> map) throws Exception {
            TestModelResponseBodyResultObjectTestResult self = new TestModelResponseBodyResultObjectTestResult();
            return TeaModel.build(map, self);
        }

        public TestModelResponseBodyResultObjectTestResult setActualResult(String actualResult) {
            this.actualResult = actualResult;
            return this;
        }
        public String getActualResult() {
            return this.actualResult;
        }

        public TestModelResponseBodyResultObjectTestResult setConsistency(Boolean consistency) {
            this.consistency = consistency;
            return this;
        }
        public Boolean getConsistency() {
            return this.consistency;
        }

        public TestModelResponseBodyResultObjectTestResult setTestResult(String testResult) {
            this.testResult = testResult;
            return this;
        }
        public String getTestResult() {
            return this.testResult;
        }

        public TestModelResponseBodyResultObjectTestResult setTrainResult(String trainResult) {
            this.trainResult = trainResult;
            return this;
        }
        public String getTrainResult() {
            return this.trainResult;
        }

    }

    public static class TestModelResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of consistencies.</p>
         * 
         * <strong>example:</strong>
         * <p>49.0</p>
         */
        @NameInMap("ConsistencyCount")
        public Long consistencyCount;

        /**
         * <p>Consistency rate.</p>
         * 
         * <strong>example:</strong>
         * <p>98.0</p>
         */
        @NameInMap("ConsistencyRate")
        public Double consistencyRate;

        /**
         * <p>Test results.</p>
         */
        @NameInMap("TestResult")
        public java.util.List<TestModelResponseBodyResultObjectTestResult> testResult;

        /**
         * <p>Total number.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Total")
        public Long total;

        public static TestModelResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            TestModelResponseBodyResultObject self = new TestModelResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public TestModelResponseBodyResultObject setConsistencyCount(Long consistencyCount) {
            this.consistencyCount = consistencyCount;
            return this;
        }
        public Long getConsistencyCount() {
            return this.consistencyCount;
        }

        public TestModelResponseBodyResultObject setConsistencyRate(Double consistencyRate) {
            this.consistencyRate = consistencyRate;
            return this;
        }
        public Double getConsistencyRate() {
            return this.consistencyRate;
        }

        public TestModelResponseBodyResultObject setTestResult(java.util.List<TestModelResponseBodyResultObjectTestResult> testResult) {
            this.testResult = testResult;
            return this;
        }
        public java.util.List<TestModelResponseBodyResultObjectTestResult> getTestResult() {
            return this.testResult;
        }

        public TestModelResponseBodyResultObject setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
