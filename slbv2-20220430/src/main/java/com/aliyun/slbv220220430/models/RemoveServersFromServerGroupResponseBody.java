// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RemoveServersFromServerGroupResponseBodyData data;

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

    public static RemoveServersFromServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupResponseBody self = new RemoveServersFromServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveServersFromServerGroupResponseBody setData(RemoveServersFromServerGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveServersFromServerGroupResponseBodyData getData() {
        return this.data;
    }

    public RemoveServersFromServerGroupResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public RemoveServersFromServerGroupResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public RemoveServersFromServerGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemoveServersFromServerGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveServersFromServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveServersFromServerGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveServersFromServerGroupResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static RemoveServersFromServerGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveServersFromServerGroupResponseBodyData self = new RemoveServersFromServerGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveServersFromServerGroupResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RemoveServersFromServerGroupResponseBodyData setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

}
