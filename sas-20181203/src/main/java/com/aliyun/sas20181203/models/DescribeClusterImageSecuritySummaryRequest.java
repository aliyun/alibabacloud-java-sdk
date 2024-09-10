// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterImageSecuritySummaryRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query containers. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the instance ID of the container</li>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>regionId</strong>: the region ID of the container</li>
     * <li><strong>clusterName</strong>: the name of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageRepoName</strong>: the name of the image repository</li>
     * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
     * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
     * <li><strong>imageDigest</strong>: the digest of the image</li>
     * <li><strong>clusterType</strong>: the type of the cluster</li>
     * <li><strong>hostIp</strong>: the public IP address</li>
     * <li><strong>pod</strong>: the pod</li>
     * <li><strong>podIp</strong>: the IP address of the pod</li>
     * <li><strong>containerId</strong>: the ID of the container</li>
     * <li><strong>vulStatus</strong>: whether vulnerabilities are detected on the container</li>
     * <li><strong>alarmStatus</strong>: whether alerts are generated for the container</li>
     * <li><strong>riskStatus</strong>: whether risks are detected on the container</li>
     * <li><strong>riskLevel</strong>: the risk level of the container</li>
     * <li><strong>containerScope</strong>: the type of the container</li>
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
     * <p>c2ac28b2d0c734df29a21d29f18ac****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>402902de6480a020b9f29e7105e77b8a218bc1cccbc3935d3b38c8ea9ba2****</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>repo</p>
     */
    @NameInMap("ImageRepoName")
    public String imageRepoName;

    /**
     * <p>The namespace of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("ImageRepoNamespace")
    public String imageRepoNamespace;

    /**
     * <p>The tag of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>3.54.0.1</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>60.190.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeClusterImageSecuritySummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterImageSecuritySummaryRequest self = new DescribeClusterImageSecuritySummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterImageSecuritySummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterImageSecuritySummaryRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeClusterImageSecuritySummaryRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeClusterImageSecuritySummaryRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeClusterImageSecuritySummaryRequest setImageRepoName(String imageRepoName) {
        this.imageRepoName = imageRepoName;
        return this;
    }
    public String getImageRepoName() {
        return this.imageRepoName;
    }

    public DescribeClusterImageSecuritySummaryRequest setImageRepoNamespace(String imageRepoNamespace) {
        this.imageRepoNamespace = imageRepoNamespace;
        return this;
    }
    public String getImageRepoNamespace() {
        return this.imageRepoNamespace;
    }

    public DescribeClusterImageSecuritySummaryRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeClusterImageSecuritySummaryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeClusterImageSecuritySummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
