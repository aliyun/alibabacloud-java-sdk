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
     * <p>The container search field. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: instance ID.</li>
     * <li><strong>appName</strong>: application name.</li>
     * <li><strong>clusterId</strong>: cluster ID.</li>
     * <li><strong>regionId</strong>: region.</li>
     * <li><strong>nodeName</strong>: node name.</li>
     * <li><strong>namespace</strong>: namespace.</li>
     * <li><strong>clusterName</strong>: cluster name.</li>
     * <li><strong>image</strong>: image name.</li>
     * <li><strong>imageRepoName</strong>: image repository name.</li>
     * <li><strong>imageRepoNamespace</strong>: image repository namespace.</li>
     * <li><strong>imageRepoTag</strong>: image tag.</li>
     * <li><strong>imageDigest</strong>: image digest.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container search field.</p>
     * 
     * <strong>example:</strong>
     * <p>c1fdb5fd8d42e425d88fd73eec7be****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>222.71.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: container ID.</li>
     * <li><strong>uuid</strong>: asset ID.</li>
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
