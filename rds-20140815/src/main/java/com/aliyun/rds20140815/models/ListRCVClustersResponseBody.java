// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListRCVClustersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>07F6177E-6DE4-408A-BB4F-0723301340F3</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>cd21387ea640145bab79a78276c1a****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SupportDiskPerformanceLevel")
        public java.util.List<String> supportDiskPerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zeqj40j2ce0s5yhg****</p>
         */
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
