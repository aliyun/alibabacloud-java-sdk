// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Clusters")
    @Validation(required = true)
    public java.util.List<DescribeClustersInServiceMeshResponseClusters> clusters;

    public static DescribeClustersInServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshResponse self = new DescribeClustersInServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeClustersInServiceMeshResponseClusters extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("ClusterType")
        @Validation(required = true)
        public String clusterType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("SgId")
        @Validation(required = true)
        public String sgId;

        @NameInMap("ClusterDomain")
        @Validation(required = true)
        public String clusterDomain;

        public static DescribeClustersInServiceMeshResponseClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersInServiceMeshResponseClusters self = new DescribeClustersInServiceMeshResponseClusters();
            return TeaModel.build(map, self);
        }

    }

}
