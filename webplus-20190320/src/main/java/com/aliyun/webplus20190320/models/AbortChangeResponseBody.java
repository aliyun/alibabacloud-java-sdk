// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class AbortChangeResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public AbortChangeResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static AbortChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbortChangeResponseBody self = new AbortChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public AbortChangeResponseBody setEnvChange(AbortChangeResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public AbortChangeResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public AbortChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbortChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbortChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class AbortChangeResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static AbortChangeResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            AbortChangeResponseBodyEnvChange self = new AbortChangeResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public AbortChangeResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public AbortChangeResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public AbortChangeResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
