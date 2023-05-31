// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventLevelCountRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the asset</p>
     * <p>*   **appName**: the name of the application</p>
     * <p>*   **clusterId**: the ID of the cluster</p>
     * <p>*   **regionId**: the ID of the region</p>
     * <p>*   **nodeName**: the name of the node</p>
     * <p>*   **namespace**: the namespace</p>
     * <p>*   **clusterName**: the name of the cluster</p>
     * <p>*   **image**: the name of the image</p>
     * <p>*   **imageRepoName**: the name of the image repository</p>
     * <p>*   **imageRepoNamespace**: the namespace to which the image repository belongs</p>
     * <p>*   **imageRepoTag**: the tag that is added to the image</p>
     * <p>*   **imageDigest**: the digest of the image</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query alert events on containers. If you specify multiple values, separate them with commas (,).</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The ID of the container.</p>
     */
    @NameInMap("ContainerIds")
    public String containerIds;

    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the UUID of the asset</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static DescribeEventLevelCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLevelCountRequest self = new DescribeEventLevelCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventLevelCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeEventLevelCountRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeEventLevelCountRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeEventLevelCountRequest setContainerIds(String containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public String getContainerIds() {
        return this.containerIds;
    }

    public DescribeEventLevelCountRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeEventLevelCountRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
