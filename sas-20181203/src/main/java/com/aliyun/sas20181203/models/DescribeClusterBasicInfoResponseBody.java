// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    public DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoResponseBody self = new DescribeClusterBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoResponseBody setClusterInfo(DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterBasicInfoResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeClusterBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfo extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("TargetResult")
        public Boolean targetResult;

        public static DescribeClusterBasicInfoResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setTargetResult(Boolean targetResult) {
            this.targetResult = targetResult;
            return this;
        }
        public Boolean getTargetResult() {
            return this.targetResult;
        }

    }

}
