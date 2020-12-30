// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class GatherAppEnvStatsResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public GatherAppEnvStatsResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static GatherAppEnvStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GatherAppEnvStatsResponseBody self = new GatherAppEnvStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GatherAppEnvStatsResponseBody setEnvChange(GatherAppEnvStatsResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public GatherAppEnvStatsResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public GatherAppEnvStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GatherAppEnvStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GatherAppEnvStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GatherAppEnvStatsResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static GatherAppEnvStatsResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            GatherAppEnvStatsResponseBodyEnvChange self = new GatherAppEnvStatsResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public GatherAppEnvStatsResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GatherAppEnvStatsResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public GatherAppEnvStatsResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
