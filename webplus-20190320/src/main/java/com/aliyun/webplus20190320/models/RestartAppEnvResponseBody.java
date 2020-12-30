// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RestartAppEnvResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public RestartAppEnvResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static RestartAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartAppEnvResponseBody self = new RestartAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartAppEnvResponseBody setEnvChange(RestartAppEnvResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public RestartAppEnvResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public RestartAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RestartAppEnvResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static RestartAppEnvResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            RestartAppEnvResponseBodyEnvChange self = new RestartAppEnvResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public RestartAppEnvResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public RestartAppEnvResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public RestartAppEnvResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
