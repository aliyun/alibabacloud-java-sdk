// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateServerGroupServersAttributeResponseBodyData data;

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

    public static UpdateServerGroupServersAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupServersAttributeResponseBody self = new UpdateServerGroupServersAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupServersAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateServerGroupServersAttributeResponseBody setData(UpdateServerGroupServersAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateServerGroupServersAttributeResponseBodyData getData() {
        return this.data;
    }

    public UpdateServerGroupServersAttributeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UpdateServerGroupServersAttributeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UpdateServerGroupServersAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateServerGroupServersAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateServerGroupServersAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServerGroupServersAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateServerGroupServersAttributeResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateServerGroupServersAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupServersAttributeResponseBodyData self = new UpdateServerGroupServersAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupServersAttributeResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UpdateServerGroupServersAttributeResponseBodyData setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

}
