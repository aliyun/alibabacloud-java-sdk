// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeployAppEnvResponseBody extends TeaModel {
    @NameInMap("EnvChange")
    public DeployAppEnvResponseBodyEnvChange envChange;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DeployAppEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployAppEnvResponseBody self = new DeployAppEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployAppEnvResponseBody setEnvChange(DeployAppEnvResponseBodyEnvChange envChange) {
        this.envChange = envChange;
        return this;
    }
    public DeployAppEnvResponseBodyEnvChange getEnvChange() {
        return this.envChange;
    }

    public DeployAppEnvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeployAppEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployAppEnvResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeployAppEnvResponseBodyEnvChange extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("EnvId")
        public String envId;

        public static DeployAppEnvResponseBodyEnvChange build(java.util.Map<String, ?> map) throws Exception {
            DeployAppEnvResponseBodyEnvChange self = new DeployAppEnvResponseBodyEnvChange();
            return TeaModel.build(map, self);
        }

        public DeployAppEnvResponseBodyEnvChange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DeployAppEnvResponseBodyEnvChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DeployAppEnvResponseBodyEnvChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

    }

}
