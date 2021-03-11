// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairInstanceResponseBody extends TeaModel {
    @NameInMap("Connections")
    public Long connections;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Config")
    public String config;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("ConnectionDomain")
    public String connectionDomain;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("QPS")
    public Long QPS;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("Bandwidth")
    public Long bandwidth;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateTairInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTairInstanceResponseBody self = new CreateTairInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTairInstanceResponseBody setConnections(Long connections) {
        this.connections = connections;
        return this;
    }
    public Long getConnections() {
        return this.connections;
    }

    public CreateTairInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateTairInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTairInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateTairInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTairInstanceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateTairInstanceResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairInstanceResponseBody setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    public CreateTairInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairInstanceResponseBody setQPS(Long QPS) {
        this.QPS = QPS;
        return this;
    }
    public Long getQPS() {
        return this.QPS;
    }

    public CreateTairInstanceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public CreateTairInstanceResponseBody setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateTairInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
