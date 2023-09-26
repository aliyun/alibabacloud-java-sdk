// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the image.</p>
     * <br>
     * <p>>  You can call the [GetOpaClusterImageList](~~GetOpaClusterImageList~~) operation to query the names of images.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The tag that is added to the container.</p>
     * <br>
     * <p>>  You can call the [GetOpaClusterLabelList](~~GetOpaClusterLabelList~~) operation to query the tags that are added to containers.</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The namespace of the cluster.</p>
     * <br>
     * <p>>  You can call the [GetOpaClusterNamespaceList](~~GetOpaClusterNamespaceList~~) operation to query the namespaces of clusters.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    public static ListCriteriaStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCriteriaStrategyRequest self = new ListCriteriaStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListCriteriaStrategyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListCriteriaStrategyRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListCriteriaStrategyRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListCriteriaStrategyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListCriteriaStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

}
