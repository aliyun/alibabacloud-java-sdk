// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterHostSecuritySummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query containers. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the instance ID</li>
     * <li><strong>appName</strong>: the name of the application</li>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>regionId</strong>: the region ID</li>
     * <li><strong>nodeName</strong>: the name of the node</li>
     * <li><strong>namespace</strong>: the namespace</li>
     * <li><strong>clusterName</strong>: the name of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageRepoName</strong>: the name of the image repository</li>
     * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
     * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
     * <li><strong>imageDigest</strong>: the digest of the image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query containers.</p>
     * 
     * <strong>example:</strong>
     * <p>c1fdb5fd8d42e425d88fd73eec7be****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>222.71.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the query. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong></li>
     * <li><strong>uuid</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DescribeClusterHostSecuritySummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterHostSecuritySummaryRequest self = new DescribeClusterHostSecuritySummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterHostSecuritySummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterHostSecuritySummaryRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeClusterHostSecuritySummaryRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeClusterHostSecuritySummaryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterHostSecuritySummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeClusterHostSecuritySummaryRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
