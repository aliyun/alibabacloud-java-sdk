// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColumnarInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeColumnarInfoResponseBodyData data;

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
     * <p>14036EBE-****-44DB-ACE9-AC6157D3A6FC</p>
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

    public static DescribeColumnarInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnarInfoResponseBody self = new DescribeColumnarInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColumnarInfoResponseBody setData(DescribeColumnarInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeColumnarInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeColumnarInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeColumnarInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColumnarInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes extends TeaModel {
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
         * <p>polarx.n8.medium.col</p>
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
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes self = new DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setAZone(String AZone) {
            this.AZone = AZone;
            return this;
        }
        public String getAZone() {
            return this.AZone;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeColumnarInfoResponseBodyDataInstanceTopologyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PhysicalNodes")
        public java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes> physicalNodes;

        public static DescribeColumnarInfoResponseBodyDataInstanceTopologyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarInfoResponseBodyDataInstanceTopologyList self = new DescribeColumnarInfoResponseBodyDataInstanceTopologyList();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeColumnarInfoResponseBodyDataInstanceTopologyList setPhysicalNodes(java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes> physicalNodes) {
            this.physicalNodes = physicalNodes;
            return this;
        }
        public java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyListPhysicalNodes> getPhysicalNodes() {
            return this.physicalNodes;
        }

    }

    public static class DescribeColumnarInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
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
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("CheckSumSwitch")
        public String checkSumSwitch;

        /**
         * <strong>example:</strong>
         * <p>polarx.n8.medium.col</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
         */
        @NameInMap("ColumnarNewVersion")
        public String columnarNewVersion;

        /**
         * <strong>example:</strong>
         * <p>polarx-col-kernel-5.4.20-20250819_17555906</p>
         */
        @NameInMap("ColumnarVersion")
        public String columnarVersion;

        @NameInMap("InstanceTopologyList")
        public java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyList> instanceTopologyList;

        /**
         * <p>server id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53755321</p>
         */
        @NameInMap("ServerId")
        public Integer serverId;

        public static DescribeColumnarInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeColumnarInfoResponseBodyData self = new DescribeColumnarInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeColumnarInfoResponseBodyData setBinlogPersistTime(Integer binlogPersistTime) {
            this.binlogPersistTime = binlogPersistTime;
            return this;
        }
        public Integer getBinlogPersistTime() {
            return this.binlogPersistTime;
        }

        public DescribeColumnarInfoResponseBodyData setBinlogSize(Integer binlogSize) {
            this.binlogSize = binlogSize;
            return this;
        }
        public Integer getBinlogSize() {
            return this.binlogSize;
        }

        public DescribeColumnarInfoResponseBodyData setCheckSumSwitch(String checkSumSwitch) {
            this.checkSumSwitch = checkSumSwitch;
            return this;
        }
        public String getCheckSumSwitch() {
            return this.checkSumSwitch;
        }

        public DescribeColumnarInfoResponseBodyData setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeColumnarInfoResponseBodyData setColumnarNewVersion(String columnarNewVersion) {
            this.columnarNewVersion = columnarNewVersion;
            return this;
        }
        public String getColumnarNewVersion() {
            return this.columnarNewVersion;
        }

        public DescribeColumnarInfoResponseBodyData setColumnarVersion(String columnarVersion) {
            this.columnarVersion = columnarVersion;
            return this;
        }
        public String getColumnarVersion() {
            return this.columnarVersion;
        }

        public DescribeColumnarInfoResponseBodyData setInstanceTopologyList(java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyList> instanceTopologyList) {
            this.instanceTopologyList = instanceTopologyList;
            return this;
        }
        public java.util.List<DescribeColumnarInfoResponseBodyDataInstanceTopologyList> getInstanceTopologyList() {
            return this.instanceTopologyList;
        }

        public DescribeColumnarInfoResponseBodyData setServerId(Integer serverId) {
            this.serverId = serverId;
            return this;
        }
        public Integer getServerId() {
            return this.serverId;
        }

    }

}
