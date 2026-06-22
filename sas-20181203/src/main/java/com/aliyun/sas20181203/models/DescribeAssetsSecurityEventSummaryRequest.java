// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cc58f827d893f4d7fb3e34b5d4395****</p>
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
     * <p>clusterName</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container search field.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-prom-operator</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the access source.</p>
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
