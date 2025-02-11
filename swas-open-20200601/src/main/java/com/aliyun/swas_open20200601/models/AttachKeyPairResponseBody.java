// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponseBody extends TeaModel {
    /**
     * <p>The total number of simple application servers to which the key pair failed to be bound.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request results.</p>
     */
    @NameInMap("Results")
    public java.util.List<AttachKeyPairResponseBodyResults> results;

    /**
     * <p>The total number of simple application servers to which the key pair is bound.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static AttachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponseBody self = new AttachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public AttachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachKeyPairResponseBody setResults(java.util.List<AttachKeyPairResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachKeyPairResponseBodyResults> getResults() {
        return this.results;
    }

    public AttachKeyPairResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class AttachKeyPairResponseBodyResults extends TeaModel {
        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The simple application server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aa6e71ddb35c46679bc4753d6219d604</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the key pair is bound to the simple application server successfully. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public String success;

        public static AttachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResults self = new AttachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachKeyPairResponseBodyResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachKeyPairResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachKeyPairResponseBodyResults setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
