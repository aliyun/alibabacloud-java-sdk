// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLoadBalancerZonesResponseBodyData data;

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

    public static UpdateLoadBalancerZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerZonesResponseBody self = new UpdateLoadBalancerZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLoadBalancerZonesResponseBody setData(UpdateLoadBalancerZonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLoadBalancerZonesResponseBodyData getData() {
        return this.data;
    }

    public UpdateLoadBalancerZonesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateLoadBalancerZonesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateLoadBalancerZonesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateLoadBalancerZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLoadBalancerZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLoadBalancerZonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateLoadBalancerZonesResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static UpdateLoadBalancerZonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerZonesResponseBodyData self = new UpdateLoadBalancerZonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerZonesResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
