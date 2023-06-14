// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterMemberInfoResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DescribeClusterMemberInfo**.</p>
     */
    @NameInMap("ClusterChildren")
    public java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> clusterChildren;

    /**
     * <p>The type of workload. The return value is **ALIYUN**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterMemberInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterMemberInfoResponseBody self = new DescribeClusterMemberInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterMemberInfoResponseBody setClusterChildren(java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> clusterChildren) {
        this.clusterChildren = clusterChildren;
        return this;
    }
    public java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> getClusterChildren() {
        return this.clusterChildren;
    }

    public DescribeClusterMemberInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterMemberInfoResponseBodyClusterChildren extends TeaModel {
        /**
         * <p>The major version of the node.</p>
         */
        @NameInMap("BandWidth")
        public Long bandWidth;

        /**
         * <p>The maximum number of connections supported by the data node.</p>
         */
        @NameInMap("BinlogRetentionDays")
        public Integer binlogRetentionDays;

        /**
         * <p>The data nodes in the cluster instance.</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The maximum memory capacity per data node. Unit: MB.</p>
         * <br>
         * <p>>  This parameter is returned only if the return value of the **Service** parameter is **redis**, which indicates a data node.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The maximum bandwidth of the data node. Unit: MB/s.</p>
         * <br>
         * <p>>  This parameter is returned only if the return value of the **Service** parameter is **redis**, which indicates a data node.</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>The retention period of binlogs.</p>
         */
        @NameInMap("DiskSizeMB")
        public Integer diskSizeMB;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReplicaSize")
        public Integer replicaSize;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **redis**: indicates a data node.</p>
         * <p>*   **configServer**: indicates the ConfigServer node.</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The name of the resource group to which the node belongs.</p>
         */
        @NameInMap("Service")
        public String service;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        /**
         * <p>The ID of the ApsaraDB for Redis instance. You can call the [DescribeInstances](~~60933~~) operation to query instance IDs.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeClusterMemberInfoResponseBodyClusterChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterMemberInfoResponseBodyClusterChildren self = new DescribeClusterMemberInfoResponseBodyClusterChildren();
            return TeaModel.build(map, self);
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBinlogRetentionDays(Integer binlogRetentionDays) {
            this.binlogRetentionDays = binlogRetentionDays;
            return this;
        }
        public Integer getBinlogRetentionDays() {
            return this.binlogRetentionDays;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setCurrentBandWidth(Long currentBandWidth) {
            this.currentBandWidth = currentBandWidth;
            return this;
        }
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setDiskSizeMB(Integer diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }
        public Integer getDiskSizeMB() {
            return this.diskSizeMB;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setReplicaSize(Integer replicaSize) {
            this.replicaSize = replicaSize;
            return this;
        }
        public Integer getReplicaSize() {
            return this.replicaSize;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
