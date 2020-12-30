// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class StopAppEnvResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public StopAppEnvResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static StopAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAppEnvResponseBody self = new StopAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAppEnvResponseBody setEnvChange(StopAppEnvResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public StopAppEnvResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public StopAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class StopAppEnvResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static StopAppEnvResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            StopAppEnvResponseBodyEnvChange self = new StopAppEnvResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public StopAppEnvResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public StopAppEnvResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public StopAppEnvResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
