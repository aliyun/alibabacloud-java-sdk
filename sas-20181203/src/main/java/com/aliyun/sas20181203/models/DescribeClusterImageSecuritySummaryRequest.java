// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterImageSecuritySummaryRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The container search field. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: container instance ID</li>
     * <li><strong>clusterId</strong>: cluster ID</li>
     * <li><strong>regionId</strong>: container region</li>
     * <li><strong>clusterName</strong>: cluster name</li>
     * <li><strong>image</strong>: image name</li>
     * <li><strong>imageRepoName</strong>: image repository name</li>
     * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
     * <li><strong>imageRepoTag</strong>: image repository tag</li>
     * <li><strong>imageDigest</strong>: image digest</li>
     * <li><strong>clusterType</strong>: cluster type</li>
     * <li><strong>hostIp</strong>: public IP address</li>
     * <li><strong>pod</strong>: pod</li>
     * <li><strong>podIp</strong>: pod IP address</li>
     * <li><strong>containerId</strong>: container ID</li>
     * <li><strong>vulStatus</strong>: whether the container has vulnerabilities</li>
     * <li><strong>alarmStatus</strong>: whether the container has security alerts</li>
     * <li><strong>riskStatus</strong>: whether the container has risks</li>
     * <li><strong>riskLevel</strong>: container risk level</li>
     * <li><strong>containerScope</strong>: container type.</li>
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
     * <p>c2ac28b2d0c734df29a21d29f18ac****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>402902de6480a020b9f29e7105e77b8a218bc1cccbc3935d3b38c8ea9ba2****</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The image repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>repo</p>
     */
    @NameInMap("ImageRepoName")
    public String imageRepoName;

    /**
     * <p>The image repository namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("ImageRepoNamespace")
    public String imageRepoNamespace;

    /**
     * <p>The image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>3.54.0.1</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
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
