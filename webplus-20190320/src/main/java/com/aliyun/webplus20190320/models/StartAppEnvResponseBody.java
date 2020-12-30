// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class StartAppEnvResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public StartAppEnvResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static StartAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAppEnvResponseBody self = new StartAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAppEnvResponseBody setEnvChange(StartAppEnvResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public StartAppEnvResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public StartAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class StartAppEnvResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static StartAppEnvResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            StartAppEnvResponseBodyEnvChange self = new StartAppEnvResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public StartAppEnvResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public StartAppEnvResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public StartAppEnvResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
