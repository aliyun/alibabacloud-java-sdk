// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAddressTypeConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLoadBalancerAddressTypeConfigResponseBodyData data;

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

    public static UpdateLoadBalancerAddressTypeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAddressTypeConfigResponseBody self = new UpdateLoadBalancerAddressTypeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setData(UpdateLoadBalancerAddressTypeConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLoadBalancerAddressTypeConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLoadBalancerAddressTypeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateLoadBalancerAddressTypeConfigResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static UpdateLoadBalancerAddressTypeConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAddressTypeConfigResponseBodyData self = new UpdateLoadBalancerAddressTypeConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAddressTypeConfigResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
