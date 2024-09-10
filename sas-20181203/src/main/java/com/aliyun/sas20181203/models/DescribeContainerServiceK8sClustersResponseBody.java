// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerServiceK8sClustersResponseBody extends TeaModel {
    /**
     * <p>The information about the clusters.</p>
     */
    @NameInMap("K8sClusters")
    public java.util.List<DescribeContainerServiceK8sClustersResponseBodyK8sClusters> k8sClusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeContainerServiceK8sClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerServiceK8sClustersResponseBody self = new DescribeContainerServiceK8sClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerServiceK8sClustersResponseBody setK8sClusters(java.util.List<DescribeContainerServiceK8sClustersResponseBodyK8sClusters> k8sClusters) {
        this.k8sClusters = k8sClusters;
        return this;
    }
    public java.util.List<DescribeContainerServiceK8sClustersResponseBodyK8sClusters> getK8sClusters() {
        return this.k8sClusters;
    }

    public DescribeContainerServiceK8sClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeContainerServiceK8sClustersResponseBodyK8sClusters extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cdbbe7aa56cbf4b8f830f83718d26****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeContainerServiceK8sClustersResponseBodyK8sClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerServiceK8sClustersResponseBodyK8sClusters self = new DescribeContainerServiceK8sClustersResponseBodyK8sClusters();
            return TeaModel.build(map, self);
        }

        public DescribeContainerServiceK8sClustersResponseBodyK8sClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeContainerServiceK8sClustersResponseBodyK8sClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
