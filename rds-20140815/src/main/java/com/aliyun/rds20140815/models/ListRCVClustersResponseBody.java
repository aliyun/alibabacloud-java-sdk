// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListRCVClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VClusters")
    public java.util.List<ListRCVClustersResponseBodyVClusters> VClusters;

    public static ListRCVClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRCVClustersResponseBody self = new ListRCVClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRCVClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRCVClustersResponseBody setVClusters(java.util.List<ListRCVClustersResponseBodyVClusters> VClusters) {
        this.VClusters = VClusters;
        return this;
    }
    public java.util.List<ListRCVClustersResponseBodyVClusters> getVClusters() {
        return this.VClusters;
    }

    public static class ListRCVClustersResponseBodyVClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SupportDiskPerformanceLevel")
        public java.util.List<String> supportDiskPerformanceLevel;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListRCVClustersResponseBodyVClusters build(java.util.Map<String, ?> map) throws Exception {
            ListRCVClustersResponseBodyVClusters self = new ListRCVClustersResponseBodyVClusters();
            return TeaModel.build(map, self);
        }

        public ListRCVClustersResponseBodyVClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListRCVClustersResponseBodyVClusters setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListRCVClustersResponseBodyVClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRCVClustersResponseBodyVClusters setSupportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
            this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
            return this;
        }
        public java.util.List<String> getSupportDiskPerformanceLevel() {
            return this.supportDiskPerformanceLevel;
        }

        public ListRCVClustersResponseBodyVClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
