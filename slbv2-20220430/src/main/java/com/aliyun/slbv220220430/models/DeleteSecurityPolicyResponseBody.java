// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class DeleteSecurityPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteSecurityPolicyResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteSecurityPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityPolicyResponseBody self = new DeleteSecurityPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecurityPolicyResponseBody setData(DeleteSecurityPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecurityPolicyResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecurityPolicyResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DeleteSecurityPolicyResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DeleteSecurityPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSecurityPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecurityPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSecurityPolicyResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        public static DeleteSecurityPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityPolicyResponseBodyData self = new DeleteSecurityPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityPolicyResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DeleteSecurityPolicyResponseBodyData setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

    }

}
