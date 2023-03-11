// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetsSecurityEventSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query on containers. Valid values:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the container instance</p>
     * <p>*   **clusterId**: the ID of the cluster</p>
     * <p>*   **regionId**: the region ID of the container</p>
     * <p>*   **clusterName**: the name of the cluster</p>
     * <p>*   **image**: the name of the image</p>
     * <p>*   **imageRepoName**: the name of the image repository</p>
     * <p>*   **imageRepoNamespace**: the namespace to which the image repository belongs</p>
     * <p>*   **imageRepoTag**: the tag that is added to the image repository</p>
     * <p>*   **imageDigest**: the digest of the image</p>
     * <p>*   **ClusterType**: the type of the cluster</p>
     * <p>*   **hostIp**: the public IP address</p>
     * <p>*   **pod**: the pod</p>
     * <p>*   **podIp**: the IP address of the pod</p>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **vulStatus**: whether vulnerabilities are detected on the container</p>
     * <p>*   **alarmStatus**: whether alerts are generated for the container</p>
     * <p>*   **riskStatus**: whether risks are detected on the container</p>
     * <p>*   **riskLevel**: the risk level of the container</p>
     * <p>*   **containerScope**: the type of the container</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query on containers.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
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
