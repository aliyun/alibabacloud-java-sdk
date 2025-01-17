// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCClustersResponseBody extends TeaModel {
    /**
     * <p>The information about the clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeRCClustersResponseBodyClusters> clusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2875D608-A228-53D7-B8C9-35F13EDCF36D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCClustersResponseBody self = new DescribeRCClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCClustersResponseBody setClusters(java.util.List<DescribeRCClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeRCClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeRCClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-30T02:16:04Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Stopping</strong></li>
         * <li><strong>Stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRCClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCClustersResponseBodyClusters self = new DescribeRCClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeRCClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeRCClustersResponseBodyClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeRCClustersResponseBodyClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRCClustersResponseBodyClusters setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public DescribeRCClustersResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
