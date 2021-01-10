// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPInstancesResponseBodyData data;

    public static QueryODPInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPInstancesResponseBody self = new QueryODPInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPInstancesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPInstancesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPInstancesResponseBody setData(QueryODPInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPInstancesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPInstancesResponseBodyDataNodes extends TeaModel {
        @NameInMap("AliyunInstanceId")
        public String aliyunInstanceId;

        @NameInMap("BizVpcId")
        public String bizVpcId;

        @NameInMap("BizVswtichId")
        public String bizVswtichId;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("CellName")
        public String cellName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ConfigSpecDesc")
        public String configSpecDesc;

        @NameInMap("CpuCount")
        public Long cpuCount;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("ExecutionDetail")
        public String executionDetail;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("MemoryCount")
        public Long memoryCount;

        @NameInMap("NodeLanAddress")
        public String nodeLanAddress;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("NodeWanAddress")
        public String nodeWanAddress;

        @NameInMap("NodeWanPort")
        public Long nodeWanPort;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("YunyouDeployUnitUrl")
        public String yunyouDeployUnitUrl;

        @NameInMap("YunyouOpsPlanUrl")
        public String yunyouOpsPlanUrl;

        @NameInMap("ZdalproxyInstanceId")
        public String zdalproxyInstanceId;

        @NameInMap("ZdalproxyNodeId")
        public String zdalproxyNodeId;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("ZoneDescription")
        public String zoneDescription;

        public static QueryODPInstancesResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryODPInstancesResponseBodyDataNodes self = new QueryODPInstancesResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public QueryODPInstancesResponseBodyDataNodes setAliyunInstanceId(String aliyunInstanceId) {
            this.aliyunInstanceId = aliyunInstanceId;
            return this;
        }
        public String getAliyunInstanceId() {
            return this.aliyunInstanceId;
        }

        public QueryODPInstancesResponseBodyDataNodes setBizVpcId(String bizVpcId) {
            this.bizVpcId = bizVpcId;
            return this;
        }
        public String getBizVpcId() {
            return this.bizVpcId;
        }

        public QueryODPInstancesResponseBodyDataNodes setBizVswtichId(String bizVswtichId) {
            this.bizVswtichId = bizVswtichId;
            return this;
        }
        public String getBizVswtichId() {
            return this.bizVswtichId;
        }

        public QueryODPInstancesResponseBodyDataNodes setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public QueryODPInstancesResponseBodyDataNodes setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public QueryODPInstancesResponseBodyDataNodes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryODPInstancesResponseBodyDataNodes setConfigSpecDesc(String configSpecDesc) {
            this.configSpecDesc = configSpecDesc;
            return this;
        }
        public String getConfigSpecDesc() {
            return this.configSpecDesc;
        }

        public QueryODPInstancesResponseBodyDataNodes setCpuCount(Long cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Long getCpuCount() {
            return this.cpuCount;
        }

        public QueryODPInstancesResponseBodyDataNodes setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public QueryODPInstancesResponseBodyDataNodes setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPInstancesResponseBodyDataNodes setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryODPInstancesResponseBodyDataNodes setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPInstancesResponseBodyDataNodes setExecutionDetail(String executionDetail) {
            this.executionDetail = executionDetail;
            return this;
        }
        public String getExecutionDetail() {
            return this.executionDetail;
        }

        public QueryODPInstancesResponseBodyDataNodes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPInstancesResponseBodyDataNodes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPInstancesResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPInstancesResponseBodyDataNodes setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public QueryODPInstancesResponseBodyDataNodes setMemoryCount(Long memoryCount) {
            this.memoryCount = memoryCount;
            return this;
        }
        public Long getMemoryCount() {
            return this.memoryCount;
        }

        public QueryODPInstancesResponseBodyDataNodes setNodeLanAddress(String nodeLanAddress) {
            this.nodeLanAddress = nodeLanAddress;
            return this;
        }
        public String getNodeLanAddress() {
            return this.nodeLanAddress;
        }

        public QueryODPInstancesResponseBodyDataNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public QueryODPInstancesResponseBodyDataNodes setNodeWanAddress(String nodeWanAddress) {
            this.nodeWanAddress = nodeWanAddress;
            return this;
        }
        public String getNodeWanAddress() {
            return this.nodeWanAddress;
        }

        public QueryODPInstancesResponseBodyDataNodes setNodeWanPort(Long nodeWanPort) {
            this.nodeWanPort = nodeWanPort;
            return this;
        }
        public Long getNodeWanPort() {
            return this.nodeWanPort;
        }

        public QueryODPInstancesResponseBodyDataNodes setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryODPInstancesResponseBodyDataNodes setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public QueryODPInstancesResponseBodyDataNodes setYunyouDeployUnitUrl(String yunyouDeployUnitUrl) {
            this.yunyouDeployUnitUrl = yunyouDeployUnitUrl;
            return this;
        }
        public String getYunyouDeployUnitUrl() {
            return this.yunyouDeployUnitUrl;
        }

        public QueryODPInstancesResponseBodyDataNodes setYunyouOpsPlanUrl(String yunyouOpsPlanUrl) {
            this.yunyouOpsPlanUrl = yunyouOpsPlanUrl;
            return this;
        }
        public String getYunyouOpsPlanUrl() {
            return this.yunyouOpsPlanUrl;
        }

        public QueryODPInstancesResponseBodyDataNodes setZdalproxyInstanceId(String zdalproxyInstanceId) {
            this.zdalproxyInstanceId = zdalproxyInstanceId;
            return this;
        }
        public String getZdalproxyInstanceId() {
            return this.zdalproxyInstanceId;
        }

        public QueryODPInstancesResponseBodyDataNodes setZdalproxyNodeId(String zdalproxyNodeId) {
            this.zdalproxyNodeId = zdalproxyNodeId;
            return this;
        }
        public String getZdalproxyNodeId() {
            return this.zdalproxyNodeId;
        }

        public QueryODPInstancesResponseBodyDataNodes setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryODPInstancesResponseBodyDataNodes setZoneDescription(String zoneDescription) {
            this.zoneDescription = zoneDescription;
            return this;
        }
        public String getZoneDescription() {
            return this.zoneDescription;
        }

    }

    public static class QueryODPInstancesResponseBodyData extends TeaModel {
        @NameInMap("BizVpcId")
        public String bizVpcId;

        @NameInMap("ConfigSpecDesc")
        public String configSpecDesc;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceLanAddress")
        public String instanceLanAddress;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstancePort")
        public Long instancePort;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceVip")
        public String instanceVip;

        @NameInMap("InstanceWanAddress")
        public String instanceWanAddress;

        @NameInMap("InstanceWanPort")
        public Long instanceWanPort;

        @NameInMap("InstanceZone")
        public String instanceZone;

        @NameInMap("Legacy")
        public Boolean legacy;

        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("PaymentType")
        public Long paymentType;

        @NameInMap("Region")
        public String region;

        @NameInMap("SchemaCount")
        public Long schemaCount;

        @NameInMap("ZoneCount")
        public Long zoneCount;

        @NameInMap("Nodes")
        public java.util.List<QueryODPInstancesResponseBodyDataNodes> nodes;

        public static QueryODPInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPInstancesResponseBodyData self = new QueryODPInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPInstancesResponseBodyData setBizVpcId(String bizVpcId) {
            this.bizVpcId = bizVpcId;
            return this;
        }
        public String getBizVpcId() {
            return this.bizVpcId;
        }

        public QueryODPInstancesResponseBodyData setConfigSpecDesc(String configSpecDesc) {
            this.configSpecDesc = configSpecDesc;
            return this;
        }
        public String getConfigSpecDesc() {
            return this.configSpecDesc;
        }

        public QueryODPInstancesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public QueryODPInstancesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public QueryODPInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryODPInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryODPInstancesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryODPInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryODPInstancesResponseBodyData setInstanceLanAddress(String instanceLanAddress) {
            this.instanceLanAddress = instanceLanAddress;
            return this;
        }
        public String getInstanceLanAddress() {
            return this.instanceLanAddress;
        }

        public QueryODPInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public QueryODPInstancesResponseBodyData setInstancePort(Long instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Long getInstancePort() {
            return this.instancePort;
        }

        public QueryODPInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public QueryODPInstancesResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public QueryODPInstancesResponseBodyData setInstanceVip(String instanceVip) {
            this.instanceVip = instanceVip;
            return this;
        }
        public String getInstanceVip() {
            return this.instanceVip;
        }

        public QueryODPInstancesResponseBodyData setInstanceWanAddress(String instanceWanAddress) {
            this.instanceWanAddress = instanceWanAddress;
            return this;
        }
        public String getInstanceWanAddress() {
            return this.instanceWanAddress;
        }

        public QueryODPInstancesResponseBodyData setInstanceWanPort(Long instanceWanPort) {
            this.instanceWanPort = instanceWanPort;
            return this;
        }
        public Long getInstanceWanPort() {
            return this.instanceWanPort;
        }

        public QueryODPInstancesResponseBodyData setInstanceZone(String instanceZone) {
            this.instanceZone = instanceZone;
            return this;
        }
        public String getInstanceZone() {
            return this.instanceZone;
        }

        public QueryODPInstancesResponseBodyData setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public QueryODPInstancesResponseBodyData setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public QueryODPInstancesResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public QueryODPInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryODPInstancesResponseBodyData setSchemaCount(Long schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Long getSchemaCount() {
            return this.schemaCount;
        }

        public QueryODPInstancesResponseBodyData setZoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Long getZoneCount() {
            return this.zoneCount;
        }

        public QueryODPInstancesResponseBodyData setNodes(java.util.List<QueryODPInstancesResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<QueryODPInstancesResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
