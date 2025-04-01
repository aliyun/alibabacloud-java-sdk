// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterMemberInfoResponseBody extends TeaModel {
    /**
     * <p>Details about data nodes in the cluster instance.</p>
     */
    @NameInMap("ClusterChildren")
    public java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> clusterChildren;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D9F3768-EDA9-4811-943E-42C8006E****</p>
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
         * <p>The maximum bandwidth of the node. Unit: MB/s.</p>
         * <blockquote>
         * <p>This parameter is returned only if the return value of <strong>Service</strong> is <strong>redis</strong>, which indicates a data node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("BandWidth")
        public Long bandWidth;

        /**
         * <p>The retention period of binlogs.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("BinlogRetentionDays")
        public Integer binlogRetentionDays;

        /**
         * <p>The type of workload. The return value is <strong>ALIYUN</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The maximum memory capacity per data node. Unit: MB.</p>
         * <blockquote>
         * <p>This parameter is returned only if the return value of <strong>Service</strong> is <strong>redis</strong>, which indicates a data node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The specifications of the data node. For more information, see <a href="https://help.aliyun.com/document_detail/164477.html">Community Edition instances that use cloud disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.shard.small.ce</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The maximum number of connections supported by the data node.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The current bandwidth of the data node, which is the sum of the default bandwidth and any extra bandwidth that is purchased. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>The storage capacity of the <a href="https://help.aliyun.com/document_detail/122389.html">enhanced SSD (ESSD)</a> that is used by the data node. Unit: MB.</p>
         * <blockquote>
         * <p>The ESSD is used only to store system operating data, such as Persistent Memory (PMEM). It is not used as a medium to write and read data.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("DiskSizeMB")
        public Integer diskSizeMB;

        /**
         * <p>The ID of the replica set in the node.</p>
         * 
         * <strong>example:</strong>
         * <p>501791111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data node.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****-db-0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of replica nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReplicaSize")
        public Integer replicaSize;

        /**
         * <p>The name of the resource group to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL_ZHANGJIAKOU_A</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>redis</strong>: data node</li>
         * <li><strong>redis_cs</strong>: config server</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The major version of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("ServiceVersion")
        public String serviceVersion;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>2****_176498472570****</p>
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
