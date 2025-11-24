// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersResponseBody extends TeaModel {
    /**
     * <p>The queried clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<DescribeServiceMeshClustersResponseBodyClusters> clusters;

    /**
     * <p>The total number of ACK clusters in the current Region.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NumberOfClusters")
    public Long numberOfClusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshClustersResponseBody self = new DescribeServiceMeshClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshClustersResponseBody setClusters(java.util.List<DescribeServiceMeshClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeServiceMeshClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeServiceMeshClustersResponseBody setNumberOfClusters(Long numberOfClusters) {
        this.numberOfClusters = numberOfClusters;
        return this;
    }
    public Long getNumberOfClusters() {
        return this.numberOfClusters;
    }

    public DescribeServiceMeshClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshClustersResponseBodyClusters extends TeaModel {
        /**
         * <p>The domain name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c.com</p>
         */
        @NameInMap("ClusterDomain")
        public String clusterDomain;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c80f45444b3da447da60a911390c2****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster type.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T15:38:16+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error message about the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>fail</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates that the cluster is available or the reason why the cluster cannot be added to the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The cluster can be added to the ASM instance.</li>
         * <li><code>1</code>: The cluster cannot be added to the ASM instance because you do not have administrator permissions on the cluster.</li>
         * <li><code>2</code>: The cluster cannot be added to the ASM instance because the cluster and the ASM instance reside in different VPCs between which no private connections are built.</li>
         * <li><code>3</code>: The CIDR block of the cluster conflicts with that of the ASM instance.</li>
         * <li><code>4</code>: The cluster has a namespace that is named istio-system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ForbiddenFlag")
        public Long forbiddenFlag;

        /**
         * <p>The reason why the cluster on the data plane cannot be added to the ASM instance. The value is a JSON string in the following format:</p>
         * <pre><code>[
         *   {
         *     &quot;cluster&quot;: &quot;cdd55bd6e054b4c6ca18ec02614******&quot;,
         *     &quot;object&quot;: &quot;Pod&quot;,
         *     &quot;cidr&quot;: &quot;172.16.0.0/24&quot;
         *   },
         *   {
         *     &quot;cluster&quot;: &quot;cfa37fdf7cb1641e1976f8293ac******&quot;,
         *     &quot;object&quot;: &quot;Pod&quot;,
         *     &quot;cidr&quot;: &quot;172.16.0.0/24&quot;
         *   }
         * ]
         * </code></pre>
         * <p>In the preceding example, the CIDR block <code>172.16.0.0/24</code> of the pod in the <code>cdd55bd6e054b4c6ca18ec02614******</code> cluster conflicts with the CIDR block <code>172.16.0.0/24</code> of the pod in the <code>cfa37fdf7cb1641e1976f8293ac******</code> cluster.</p>
         * <p>Valid values of the <code>object</code> parameter:</p>
         * <ul>
         * <li><code>Pod</code></li>
         * <li><code>Service</code></li>
         * <li><code>VSwitch</code></li>
         * <li><code>VPC</code></li>
         * <li><code>VPC CIDR</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;cdd55bd6e054b4c6ca18ec02614******&quot;, &quot;object&quot;:&quot;Pod&quot;, &quot;cidr&quot;:&quot;172.16.0.0/24&quot;},{&quot;cluster&quot;:&quot;cfa37fdf7cb1641e1976f8293ac******&quot;, &quot;object&quot;:&quot;Pod&quot;, &quot;cidr&quot;:&quot;172.16.0.0/24&quot;}]</p>
         */
        @NameInMap("ForbiddenInfo")
        public String forbiddenInfo;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ask1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ASM instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp197668l6iupljy****</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li><code>running</code>: The cluster is running.</li>
         * <li><code>starting</code>: The cluster is starting.</li>
         * <li><code>stopping</code>: The cluster is being stopped.</li>
         * <li><code>stopped</code>: The cluster is stopped.</li>
         * <li><code>failed</code>: The cluster fails to be run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the cluster was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12T15:38:16+08:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The version number of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.16.6-aliyun.1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbrwmt95b4zf6wf7****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeServiceMeshClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshClustersResponseBodyClusters self = new DescribeServiceMeshClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterDomain(String clusterDomain) {
            this.clusterDomain = clusterDomain;
            return this;
        }
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setForbiddenFlag(Long forbiddenFlag) {
            this.forbiddenFlag = forbiddenFlag;
            return this;
        }
        public Long getForbiddenFlag() {
            return this.forbiddenFlag;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setForbiddenInfo(String forbiddenInfo) {
            this.forbiddenInfo = forbiddenInfo;
            return this;
        }
        public String getForbiddenInfo() {
            return this.forbiddenInfo;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeServiceMeshClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
