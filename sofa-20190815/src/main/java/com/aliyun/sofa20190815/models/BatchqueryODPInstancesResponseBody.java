// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<BatchqueryODPInstancesResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryODPInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesResponseBody self = new BatchqueryODPInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryODPInstancesResponseBody setData(java.util.List<BatchqueryODPInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchqueryODPInstancesResponseBodyData> getData() {
        return this.data;
    }

    public BatchqueryODPInstancesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryODPInstancesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryODPInstancesResponseBodyDataNodes extends TeaModel {
        @NameInMap("ConfigSpecDesc")
        public String configSpecDesc;

        @NameInMap("MemoryCount")
        public Long memoryCount;

        @NameInMap("NodeWanPort")
        public Long nodeWanPort;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Port")
        public Long port;

        @NameInMap("ZdalproxyNodeId")
        public String zdalproxyNodeId;

        @NameInMap("ZdalproxyInstanceId")
        public String zdalproxyInstanceId;

        @NameInMap("YunyouOpsPlanUrl")
        public String yunyouOpsPlanUrl;

        @NameInMap("BizVpcId")
        public String bizVpcId;

        @NameInMap("CellName")
        public String cellName;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("ExecutionDetail")
        public String executionDetail;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("BizVswtichId")
        public String bizVswtichId;

        @NameInMap("YunyouDeployUnitUrl")
        public String yunyouDeployUnitUrl;

        @NameInMap("CellId")
        public String cellId;

        @NameInMap("NodeWanAddress")
        public String nodeWanAddress;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Zone")
        public String zone;

        @NameInMap("CpuCount")
        public Long cpuCount;

        @NameInMap("NodeLanAddress")
        public String nodeLanAddress;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryODPInstancesResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPInstancesResponseBodyDataNodes self = new BatchqueryODPInstancesResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setConfigSpecDesc(String configSpecDesc) {
            this.configSpecDesc = configSpecDesc;
            return this;
        }
        public String getConfigSpecDesc() {
            return this.configSpecDesc;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setMemoryCount(Long memoryCount) {
            this.memoryCount = memoryCount;
            return this;
        }
        public Long getMemoryCount() {
            return this.memoryCount;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setNodeWanPort(Long nodeWanPort) {
            this.nodeWanPort = nodeWanPort;
            return this;
        }
        public Long getNodeWanPort() {
            return this.nodeWanPort;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setZdalproxyNodeId(String zdalproxyNodeId) {
            this.zdalproxyNodeId = zdalproxyNodeId;
            return this;
        }
        public String getZdalproxyNodeId() {
            return this.zdalproxyNodeId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setZdalproxyInstanceId(String zdalproxyInstanceId) {
            this.zdalproxyInstanceId = zdalproxyInstanceId;
            return this;
        }
        public String getZdalproxyInstanceId() {
            return this.zdalproxyInstanceId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setYunyouOpsPlanUrl(String yunyouOpsPlanUrl) {
            this.yunyouOpsPlanUrl = yunyouOpsPlanUrl;
            return this;
        }
        public String getYunyouOpsPlanUrl() {
            return this.yunyouOpsPlanUrl;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setBizVpcId(String bizVpcId) {
            this.bizVpcId = bizVpcId;
            return this;
        }
        public String getBizVpcId() {
            return this.bizVpcId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setExecutionDetail(String executionDetail) {
            this.executionDetail = executionDetail;
            return this;
        }
        public String getExecutionDetail() {
            return this.executionDetail;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setBizVswtichId(String bizVswtichId) {
            this.bizVswtichId = bizVswtichId;
            return this;
        }
        public String getBizVswtichId() {
            return this.bizVswtichId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setYunyouDeployUnitUrl(String yunyouDeployUnitUrl) {
            this.yunyouDeployUnitUrl = yunyouDeployUnitUrl;
            return this;
        }
        public String getYunyouDeployUnitUrl() {
            return this.yunyouDeployUnitUrl;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }
        public String getCellId() {
            return this.cellId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setNodeWanAddress(String nodeWanAddress) {
            this.nodeWanAddress = nodeWanAddress;
            return this;
        }
        public String getNodeWanAddress() {
            return this.nodeWanAddress;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setCpuCount(Long cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Long getCpuCount() {
            return this.cpuCount;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setNodeLanAddress(String nodeLanAddress) {
            this.nodeLanAddress = nodeLanAddress;
            return this;
        }
        public String getNodeLanAddress() {
            return this.nodeLanAddress;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public BatchqueryODPInstancesResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class BatchqueryODPInstancesResponseBodyData extends TeaModel {
        @NameInMap("PaymentType")
        public Long paymentType;

        @NameInMap("ConfigSpecDesc")
        public String configSpecDesc;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("BizVpcId")
        public String bizVpcId;

        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("EnvMode")
        public String envMode;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Region")
        public String region;

        @NameInMap("InstancePort")
        public Long instancePort;

        @NameInMap("Nodes")
        public java.util.List<BatchqueryODPInstancesResponseBodyDataNodes> nodes;

        @NameInMap("EnvTenant")
        public String envTenant;

        @NameInMap("Legacy")
        public Boolean legacy;

        @NameInMap("InstanceLanAddress")
        public String instanceLanAddress;

        @NameInMap("SchemaCount")
        public Long schemaCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceWanAddress")
        public String instanceWanAddress;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceZone")
        public String instanceZone;

        @NameInMap("InstanceWanPort")
        public Long instanceWanPort;

        @NameInMap("ZoneCount")
        public Long zoneCount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceVip")
        public String instanceVip;

        @NameInMap("Id")
        public Long id;

        public static BatchqueryODPInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryODPInstancesResponseBodyData self = new BatchqueryODPInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryODPInstancesResponseBodyData setPaymentType(Long paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Long getPaymentType() {
            return this.paymentType;
        }

        public BatchqueryODPInstancesResponseBodyData setConfigSpecDesc(String configSpecDesc) {
            this.configSpecDesc = configSpecDesc;
            return this;
        }
        public String getConfigSpecDesc() {
            return this.configSpecDesc;
        }

        public BatchqueryODPInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public BatchqueryODPInstancesResponseBodyData setBizVpcId(String bizVpcId) {
            this.bizVpcId = bizVpcId;
            return this;
        }
        public String getBizVpcId() {
            return this.bizVpcId;
        }

        public BatchqueryODPInstancesResponseBodyData setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public BatchqueryODPInstancesResponseBodyData setEnvMode(String envMode) {
            this.envMode = envMode;
            return this;
        }
        public String getEnvMode() {
            return this.envMode;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public BatchqueryODPInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public BatchqueryODPInstancesResponseBodyData setInstancePort(Long instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Long getInstancePort() {
            return this.instancePort;
        }

        public BatchqueryODPInstancesResponseBodyData setNodes(java.util.List<BatchqueryODPInstancesResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<BatchqueryODPInstancesResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public BatchqueryODPInstancesResponseBodyData setEnvTenant(String envTenant) {
            this.envTenant = envTenant;
            return this;
        }
        public String getEnvTenant() {
            return this.envTenant;
        }

        public BatchqueryODPInstancesResponseBodyData setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceLanAddress(String instanceLanAddress) {
            this.instanceLanAddress = instanceLanAddress;
            return this;
        }
        public String getInstanceLanAddress() {
            return this.instanceLanAddress;
        }

        public BatchqueryODPInstancesResponseBodyData setSchemaCount(Long schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Long getSchemaCount() {
            return this.schemaCount;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceWanAddress(String instanceWanAddress) {
            this.instanceWanAddress = instanceWanAddress;
            return this;
        }
        public String getInstanceWanAddress() {
            return this.instanceWanAddress;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceZone(String instanceZone) {
            this.instanceZone = instanceZone;
            return this;
        }
        public String getInstanceZone() {
            return this.instanceZone;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceWanPort(Long instanceWanPort) {
            this.instanceWanPort = instanceWanPort;
            return this;
        }
        public Long getInstanceWanPort() {
            return this.instanceWanPort;
        }

        public BatchqueryODPInstancesResponseBodyData setZoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Long getZoneCount() {
            return this.zoneCount;
        }

        public BatchqueryODPInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public BatchqueryODPInstancesResponseBodyData setInstanceVip(String instanceVip) {
            this.instanceVip = instanceVip;
            return this;
        }
        public String getInstanceVip() {
            return this.instanceVip;
        }

        public BatchqueryODPInstancesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
