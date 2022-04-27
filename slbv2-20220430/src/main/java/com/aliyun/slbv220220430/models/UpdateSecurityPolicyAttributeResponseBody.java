// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateSecurityPolicyAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSecurityPolicyAttributeResponseBodyData data;

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

    public static UpdateSecurityPolicyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityPolicyAttributeResponseBody self = new UpdateSecurityPolicyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityPolicyAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSecurityPolicyAttributeResponseBody setData(UpdateSecurityPolicyAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSecurityPolicyAttributeResponseBodyData getData() {
        return this.data;
    }

    public UpdateSecurityPolicyAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateSecurityPolicyAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateSecurityPolicyAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateSecurityPolicyAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSecurityPolicyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecurityPolicyAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSecurityPolicyAttributeResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        public static UpdateSecurityPolicyAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSecurityPolicyAttributeResponseBodyData self = new UpdateSecurityPolicyAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSecurityPolicyAttributeResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UpdateSecurityPolicyAttributeResponseBodyData setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

    }

}
