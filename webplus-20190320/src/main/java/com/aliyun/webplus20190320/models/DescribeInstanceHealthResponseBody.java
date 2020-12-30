// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeInstanceHealthResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceHealth")
    public DescribeInstanceHealthResponseBodyInstanceHealth instanceHealth;

    @NameInMap("Code")
    public String code;

    public static DescribeInstanceHealthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceHealthResponseBody self = new DescribeInstanceHealthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceHealthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceHealthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceHealthResponseBody setInstanceHealth(DescribeInstanceHealthResponseBodyInstanceHealth instanceHealth) {
        this.instanceHealth = instanceHealth;
        return this;
    }
    public DescribeInstanceHealthResponseBodyInstanceHealth getInstanceHealth() {
        return this.instanceHealth;
    }

    public DescribeInstanceHealthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeInstanceHealthResponseBodyInstanceHealth extends TeaModel {
        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DisconnectedTime")
        public Long disconnectedTime;

        @NameInMap("AgentStatus")
        public String agentStatus;

        public static DescribeInstanceHealthResponseBodyInstanceHealth build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceHealthResponseBodyInstanceHealth self = new DescribeInstanceHealthResponseBodyInstanceHealth();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceHealthResponseBodyInstanceHealth setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public DescribeInstanceHealthResponseBodyInstanceHealth setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceHealthResponseBodyInstanceHealth setDisconnectedTime(Long disconnectedTime) {
            this.disconnectedTime = disconnectedTime;
            return this;
        }
        public Long getDisconnectedTime() {
            return this.disconnectedTime;
        }

        public DescribeInstanceHealthResponseBodyInstanceHealth setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

    }

}
