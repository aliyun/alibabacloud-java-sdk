// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterInfoListResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public java.util.List<DescribeClusterInfoListResponseBodyClusterList> clusterList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterInfoListResponseBody self = new DescribeClusterInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterInfoListResponseBody setClusterList(java.util.List<DescribeClusterInfoListResponseBodyClusterList> clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public java.util.List<DescribeClusterInfoListResponseBodyClusterList> getClusterList() {
        return this.clusterList;
    }

    public DescribeClusterInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterInfoListResponseBodyClusterList extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("TargetResult")
        public Boolean targetResult;

        public static DescribeClusterInfoListResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterInfoListResponseBodyClusterList self = new DescribeClusterInfoListResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterInfoListResponseBodyClusterList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterInfoListResponseBodyClusterList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterInfoListResponseBodyClusterList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeClusterInfoListResponseBodyClusterList setTargetResult(Boolean targetResult) {
            this.targetResult = targetResult;
            return this;
        }
        public Boolean getTargetResult() {
            return this.targetResult;
        }

    }

}
