// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterMemberInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterChildren")
    public java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> clusterChildren;

    public static DescribeClusterMemberInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterMemberInfoResponseBody self = new DescribeClusterMemberInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterMemberInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterMemberInfoResponseBody setClusterChildren(java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> clusterChildren) {
        this.clusterChildren = clusterChildren;
        return this;
    }
    public java.util.List<DescribeClusterMemberInfoResponseBodyClusterChildren> getClusterChildren() {
        return this.clusterChildren;
    }

    public static class DescribeClusterMemberInfoResponseBodyClusterChildren extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("DiskSizeMB")
        public Integer diskSizeMB;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Service")
        public String service;

        @NameInMap("BinlogRetentionDays")
        public Integer binlogRetentionDays;

        @NameInMap("Connections")
        public Long connections;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("ReplicaSize")
        public Integer replicaSize;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DescribeClusterMemberInfoResponseBodyClusterChildren build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterMemberInfoResponseBodyClusterChildren self = new DescribeClusterMemberInfoResponseBodyClusterChildren();
            return TeaModel.build(map, self);
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setDiskSizeMB(Integer diskSizeMB) {
            this.diskSizeMB = diskSizeMB;
            return this;
        }
        public Integer getDiskSizeMB() {
            return this.diskSizeMB;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setCurrentBandWidth(Long currentBandWidth) {
            this.currentBandWidth = currentBandWidth;
            return this;
        }
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setBinlogRetentionDays(Integer binlogRetentionDays) {
            this.binlogRetentionDays = binlogRetentionDays;
            return this;
        }
        public Integer getBinlogRetentionDays() {
            return this.binlogRetentionDays;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setReplicaSize(Integer replicaSize) {
            this.replicaSize = replicaSize;
            return this;
        }
        public Integer getReplicaSize() {
            return this.replicaSize;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterMemberInfoResponseBodyClusterChildren setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
