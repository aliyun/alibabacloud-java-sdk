// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeCdcInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeCdcInfoResponseBodyData data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCdcInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdcInfoResponseBody self = new DescribeCdcInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdcInfoResponseBody setData(DescribeCdcInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCdcInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeCdcInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeCdcInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdcInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AZone")
        public String AZone;

        /**
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("Disk")
        public Integer disk;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e.cdc</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>pxc-c-***</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>polarx-cdc-kernel-***</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes self = new DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes();
            return TeaModel.build(map, self);
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setAZone(String AZone) {
            this.AZone = AZone;
            return this;
        }
        public String getAZone() {
            return this.AZone;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeCdcInfoResponseBodyDataInstanceTopologyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BINLOG_X</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>RECORD</p>
         */
        @NameInMap("HashLevel")
        public String hashLevel;

        /**
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PhysicalNodes")
        public java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes> physicalNodes;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StreamNum")
        public Integer streamNum;

        public static DescribeCdcInfoResponseBodyDataInstanceTopologyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcInfoResponseBodyDataInstanceTopologyList self = new DescribeCdcInfoResponseBodyDataInstanceTopologyList();
            return TeaModel.build(map, self);
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setHashLevel(String hashLevel) {
            this.hashLevel = hashLevel;
            return this;
        }
        public String getHashLevel() {
            return this.hashLevel;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setPhysicalNodes(java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes> physicalNodes) {
            this.physicalNodes = physicalNodes;
            return this;
        }
        public java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyListPhysicalNodes> getPhysicalNodes() {
            return this.physicalNodes;
        }

        public DescribeCdcInfoResponseBodyDataInstanceTopologyList setStreamNum(Integer streamNum) {
            this.streamNum = streamNum;
            return this;
        }
        public Integer getStreamNum() {
            return this.streamNum;
        }

    }

    public static class DescribeCdcInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("BinlogPersistTime")
        public Integer binlogPersistTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>524288000</p>
         */
        @NameInMap("BinlogSize")
        public Integer binlogSize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-cdc-kernel-***</p>
         */
        @NameInMap("CdcNewVersion")
        public String cdcNewVersion;

        /**
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("CheckSumSwitch")
        public String checkSumSwitch;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCyclicReplication")
        public Boolean enableCyclicReplication;

        @NameInMap("InstanceTopologyList")
        public java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyList> instanceTopologyList;

        /**
         * <p>server id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3014767486</p>
         */
        @NameInMap("ServerId")
        public Integer serverId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VersionSupportMultiCdc")
        public Boolean versionSupportMultiCdc;

        public static DescribeCdcInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdcInfoResponseBodyData self = new DescribeCdcInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCdcInfoResponseBodyData setBinlogPersistTime(Integer binlogPersistTime) {
            this.binlogPersistTime = binlogPersistTime;
            return this;
        }
        public Integer getBinlogPersistTime() {
            return this.binlogPersistTime;
        }

        public DescribeCdcInfoResponseBodyData setBinlogSize(Integer binlogSize) {
            this.binlogSize = binlogSize;
            return this;
        }
        public Integer getBinlogSize() {
            return this.binlogSize;
        }

        public DescribeCdcInfoResponseBodyData setCdcNewVersion(String cdcNewVersion) {
            this.cdcNewVersion = cdcNewVersion;
            return this;
        }
        public String getCdcNewVersion() {
            return this.cdcNewVersion;
        }

        public DescribeCdcInfoResponseBodyData setCheckSumSwitch(String checkSumSwitch) {
            this.checkSumSwitch = checkSumSwitch;
            return this;
        }
        public String getCheckSumSwitch() {
            return this.checkSumSwitch;
        }

        public DescribeCdcInfoResponseBodyData setEnableCyclicReplication(Boolean enableCyclicReplication) {
            this.enableCyclicReplication = enableCyclicReplication;
            return this;
        }
        public Boolean getEnableCyclicReplication() {
            return this.enableCyclicReplication;
        }

        public DescribeCdcInfoResponseBodyData setInstanceTopologyList(java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyList> instanceTopologyList) {
            this.instanceTopologyList = instanceTopologyList;
            return this;
        }
        public java.util.List<DescribeCdcInfoResponseBodyDataInstanceTopologyList> getInstanceTopologyList() {
            return this.instanceTopologyList;
        }

        public DescribeCdcInfoResponseBodyData setServerId(Integer serverId) {
            this.serverId = serverId;
            return this;
        }
        public Integer getServerId() {
            return this.serverId;
        }

        public DescribeCdcInfoResponseBodyData setVersionSupportMultiCdc(Boolean versionSupportMultiCdc) {
            this.versionSupportMultiCdc = versionSupportMultiCdc;
            return this;
        }
        public Boolean getVersionSupportMultiCdc() {
            return this.versionSupportMultiCdc;
        }

    }

}
