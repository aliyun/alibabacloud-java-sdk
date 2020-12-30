// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ResumeChangeResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public ResumeChangeResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static ResumeChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeChangeResponseBody self = new ResumeChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeChangeResponseBody setEnvChange(ResumeChangeResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public ResumeChangeResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public ResumeChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ResumeChangeResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static ResumeChangeResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            ResumeChangeResponseBodyEnvChange self = new ResumeChangeResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public ResumeChangeResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ResumeChangeResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public ResumeChangeResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
