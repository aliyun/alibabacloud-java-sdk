// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvInstanceHealthResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("EnvInstanceHealth")
    public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth envInstanceHealth;

    public static DescribeAppEnvInstanceHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvInstanceHealthResponseBody self = new DescribeAppEnvInstanceHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvInstanceHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppEnvInstanceHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppEnvInstanceHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppEnvInstanceHealthResponseBody setEnvInstanceHealth(DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth envInstanceHealth) {
        this.envInstanceHealth = envInstanceHealth;
        return this;
    }
    public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth getEnvInstanceHealth() {
        return this.envInstanceHealth;
    }

    public static class DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth extends TeaModel {
        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DisconnectedTime")
        public String disconnectedTime;

        @NameInMap("AgentStatus")
        public String agentStatus;

        public static DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth self = new DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth setDisconnectedTime(String disconnectedTime) {
            this.disconnectedTime = disconnectedTime;
            return this;
        }
        public String getDisconnectedTime() {
            return this.disconnectedTime;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

    }

    public static class DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList extends TeaModel {
        @NameInMap("InstanceHealth")
        public java.util.List<DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth> instanceHealth;

        public static DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList self = new DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList setInstanceHealth(java.util.List<DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth> instanceHealth) {
            this.instanceHealth = instanceHealth;
            return this;
        }
        public java.util.List<DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthListInstanceHealth> getInstanceHealth() {
            return this.instanceHealth;
        }

    }

    public static class DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth extends TeaModel {
        @NameInMap("EnableHealthCheck")
        public Boolean enableHealthCheck;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("InstanceHealthList")
        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList instanceHealthList;

        public static DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth self = new DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth setEnableHealthCheck(Boolean enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }
        public Boolean getEnableHealthCheck() {
            return this.enableHealthCheck;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealth setInstanceHealthList(DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList instanceHealthList) {
            this.instanceHealthList = instanceHealthList;
            return this;
        }
        public DescribeAppEnvInstanceHealthResponseBodyEnvInstanceHealthInstanceHealthList getInstanceHealthList() {
            return this.instanceHealthList;
        }

    }

}
