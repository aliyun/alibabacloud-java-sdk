// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateListenerAttributeResponseBodyData data;

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

    public static UpdateListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeResponseBody self = new UpdateListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateListenerAttributeResponseBody setData(UpdateListenerAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateListenerAttributeResponseBodyData getData() {
        return this.data;
    }

    public UpdateListenerAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateListenerAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateListenerAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateListenerAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateListenerAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateListenerAttributeResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static UpdateListenerAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeResponseBodyData self = new UpdateListenerAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
