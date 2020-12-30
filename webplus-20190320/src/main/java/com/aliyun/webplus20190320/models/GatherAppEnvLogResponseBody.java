// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class GatherAppEnvLogResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public GatherAppEnvLogResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static GatherAppEnvLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GatherAppEnvLogResponseBody self = new GatherAppEnvLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GatherAppEnvLogResponseBody setEnvChange(GatherAppEnvLogResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public GatherAppEnvLogResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public GatherAppEnvLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GatherAppEnvLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GatherAppEnvLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GatherAppEnvLogResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static GatherAppEnvLogResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            GatherAppEnvLogResponseBodyEnvChange self = new GatherAppEnvLogResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public GatherAppEnvLogResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GatherAppEnvLogResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public GatherAppEnvLogResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
