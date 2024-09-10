// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc58f827d893f4d7fb3e34b5d4395****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query on containers. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the ID of the container instance</li>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>regionId</strong>: the region ID of the container</li>
     * <li><strong>clusterName</strong>: the name of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageRepoName</strong>: the name of the image repository</li>
     * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
     * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
     * <li><strong>imageDigest</strong>: the digest of the image</li>
     * <li><strong>ClusterType</strong>: the type of the cluster</li>
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
     * <p>clusterName</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query on containers.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-prom-operator</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>113.108.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAssetsSecurityEventSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsSecurityEventSummaryRequest self = new DescribeAssetsSecurityEventSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsSecurityEventSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAssetsSecurityEventSummaryRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeAssetsSecurityEventSummaryRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeAssetsSecurityEventSummaryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAssetsSecurityEventSummaryRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
