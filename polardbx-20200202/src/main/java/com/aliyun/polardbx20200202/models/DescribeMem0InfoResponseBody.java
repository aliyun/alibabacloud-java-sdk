// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeMem0InfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeMem0InfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C457B28E-9CAB-4B77-B5C6-5D71B7870B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMem0InfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMem0InfoResponseBody self = new DescribeMem0InfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMem0InfoResponseBody setData(DescribeMem0InfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMem0InfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeMem0InfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMem0InfoResponseBodyDataInstanceConnAddrs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz.polarx.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfzjayd-cn-20251013180429</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeMem0InfoResponseBodyDataInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0InfoResponseBodyDataInstanceConnAddrs self = new DescribeMem0InfoResponseBodyDataInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeMem0InfoResponseBodyDataInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeMem0InfoResponseBodyDataInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mysql.x2.large.2c</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("ConnAddrs")
        public java.util.List<DescribeMem0InfoResponseBodyDataInstanceConnAddrs> connAddrs;

        /**
         * <strong>example:</strong>
         * <p>2026-02-17T02:00:20Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>pxc-spsil01pww4hfz-mem</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4n4hf9xey7ea3lp4bwwx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-t4ny14pr37spmjsbv5dc2</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>ap-southeast-1a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeMem0InfoResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0InfoResponseBodyDataInstance self = new DescribeMem0InfoResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribeMem0InfoResponseBodyDataInstance setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeMem0InfoResponseBodyDataInstance setConnAddrs(java.util.List<DescribeMem0InfoResponseBodyDataInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeMem0InfoResponseBodyDataInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeMem0InfoResponseBodyDataInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeMem0InfoResponseBodyDataInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMem0InfoResponseBodyDataInstance setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeMem0InfoResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeMem0InfoResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeMem0InfoResponseBodyDataInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeMem0InfoResponseBodyDataInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeMem0InfoResponseBodyDataInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeMem0InfoResponseBodyDataInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeMem0InfoResponseBodyData extends TeaModel {
        @NameInMap("Instance")
        public DescribeMem0InfoResponseBodyDataInstance instance;

        public static DescribeMem0InfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMem0InfoResponseBodyData self = new DescribeMem0InfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMem0InfoResponseBodyData setInstance(DescribeMem0InfoResponseBodyDataInstance instance) {
            this.instance = instance;
            return this;
        }
        public DescribeMem0InfoResponseBodyDataInstance getInstance() {
            return this.instance;
        }

    }

}
