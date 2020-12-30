// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class PauseChangeResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public PauseChangeResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static PauseChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PauseChangeResponseBody self = new PauseChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public PauseChangeResponseBody setEnvChange(PauseChangeResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public PauseChangeResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public PauseChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PauseChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PauseChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class PauseChangeResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static PauseChangeResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            PauseChangeResponseBodyEnvChange self = new PauseChangeResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public PauseChangeResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public PauseChangeResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public PauseChangeResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
