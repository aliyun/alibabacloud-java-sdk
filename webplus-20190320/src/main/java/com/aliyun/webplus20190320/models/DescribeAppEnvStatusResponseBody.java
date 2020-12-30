// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvStatus")
    public DescribeAppEnvStatusResponseBodyEnvStatus envStatus;

    @NameInMap("Code")
    public String code;

    public static DescribeAppEnvStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvStatusResponseBody self = new DescribeAppEnvStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppEnvStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppEnvStatusResponseBody setEnvStatus(DescribeAppEnvStatusResponseBodyEnvStatus envStatus) {
        this.envStatus = envStatus;
        return this;
    }
    public DescribeAppEnvStatusResponseBodyEnvStatus getEnvStatus() {
        return this.envStatus;
    }

    public DescribeAppEnvStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus extends TeaModel {
        @NameInMap("ConnectedInstances")
        public Integer connectedInstances;

        @NameInMap("DisconnectedInstances")
        public Integer disconnectedInstances;

        public static DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus self = new DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus setConnectedInstances(Integer connectedInstances) {
            this.connectedInstances = connectedInstances;
            return this;
        }
        public Integer getConnectedInstances() {
            return this.connectedInstances;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus setDisconnectedInstances(Integer disconnectedInstances) {
            this.disconnectedInstances = disconnectedInstances;
            return this;
        }
        public Integer getDisconnectedInstances() {
            return this.disconnectedInstances;
        }

    }

    public static class DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus extends TeaModel {
        @NameInMap("HealthyInstances")
        public Integer healthyInstances;

        @NameInMap("StoppedInstances")
        public Integer stoppedInstances;

        @NameInMap("UnhealthyInstances")
        public Integer unhealthyInstances;

        @NameInMap("UnknownInstances")
        public Integer unknownInstances;

        public static DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus self = new DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus setHealthyInstances(Integer healthyInstances) {
            this.healthyInstances = healthyInstances;
            return this;
        }
        public Integer getHealthyInstances() {
            return this.healthyInstances;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus setStoppedInstances(Integer stoppedInstances) {
            this.stoppedInstances = stoppedInstances;
            return this;
        }
        public Integer getStoppedInstances() {
            return this.stoppedInstances;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus setUnhealthyInstances(Integer unhealthyInstances) {
            this.unhealthyInstances = unhealthyInstances;
            return this;
        }
        public Integer getUnhealthyInstances() {
            return this.unhealthyInstances;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus setUnknownInstances(Integer unknownInstances) {
            this.unknownInstances = unknownInstances;
            return this;
        }
        public Integer getUnknownInstances() {
            return this.unknownInstances;
        }

    }

    public static class DescribeAppEnvStatusResponseBodyEnvStatus extends TeaModel {
        @NameInMap("ChangeBanner")
        public String changeBanner;

        @NameInMap("LatestChangeId")
        public String latestChangeId;

        @NameInMap("EnvStatus")
        public String envStatus;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("InstanceAgentStatus")
        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus instanceAgentStatus;

        @NameInMap("LastEnvStatus")
        public String lastEnvStatus;

        @NameInMap("InstanceAppStatus")
        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus instanceAppStatus;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("AbortingChange")
        public Boolean abortingChange;

        @NameInMap("ApplyingChange")
        public Boolean applyingChange;

        public static DescribeAppEnvStatusResponseBodyEnvStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppEnvStatusResponseBodyEnvStatus self = new DescribeAppEnvStatusResponseBodyEnvStatus();
            return TeaModel.build(map, self);
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setChangeBanner(String changeBanner) {
            this.changeBanner = changeBanner;
            return this;
        }
        public String getChangeBanner() {
            return this.changeBanner;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setLatestChangeId(String latestChangeId) {
            this.latestChangeId = latestChangeId;
            return this;
        }
        public String getLatestChangeId() {
            return this.latestChangeId;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setEnvStatus(String envStatus) {
            this.envStatus = envStatus;
            return this;
        }
        public String getEnvStatus() {
            return this.envStatus;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setInstanceAgentStatus(DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus instanceAgentStatus) {
            this.instanceAgentStatus = instanceAgentStatus;
            return this;
        }
        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAgentStatus getInstanceAgentStatus() {
            return this.instanceAgentStatus;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setLastEnvStatus(String lastEnvStatus) {
            this.lastEnvStatus = lastEnvStatus;
            return this;
        }
        public String getLastEnvStatus() {
            return this.lastEnvStatus;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setInstanceAppStatus(DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus instanceAppStatus) {
            this.instanceAppStatus = instanceAppStatus;
            return this;
        }
        public DescribeAppEnvStatusResponseBodyEnvStatusInstanceAppStatus getInstanceAppStatus() {
            return this.instanceAppStatus;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setAbortingChange(Boolean abortingChange) {
            this.abortingChange = abortingChange;
            return this;
        }
        public Boolean getAbortingChange() {
            return this.abortingChange;
        }

        public DescribeAppEnvStatusResponseBodyEnvStatus setApplyingChange(Boolean applyingChange) {
            this.applyingChange = applyingChange;
            return this;
        }
        public Boolean getApplyingChange() {
            return this.applyingChange;
        }

    }

}
