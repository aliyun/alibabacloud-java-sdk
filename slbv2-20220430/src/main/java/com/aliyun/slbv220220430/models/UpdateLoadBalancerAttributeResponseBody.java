// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLoadBalancerAttributeResponseBodyData data;

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

    public static UpdateLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeResponseBody self = new UpdateLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLoadBalancerAttributeResponseBody setData(UpdateLoadBalancerAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLoadBalancerAttributeResponseBodyData getData() {
        return this.data;
    }

    public UpdateLoadBalancerAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateLoadBalancerAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateLoadBalancerAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateLoadBalancerAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLoadBalancerAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateLoadBalancerAttributeResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static UpdateLoadBalancerAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAttributeResponseBodyData self = new UpdateLoadBalancerAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAttributeResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
