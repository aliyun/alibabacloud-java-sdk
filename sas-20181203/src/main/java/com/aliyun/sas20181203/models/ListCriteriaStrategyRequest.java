// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the image.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GetOpaClusterImageList~~">GetOpaClusterImageList</a> operation to query the names of images.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testImage</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The tag that is added to the container.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GetOpaClusterLabelList~~">GetOpaClusterLabelList</a> operation to query the tags that are added to containers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testlabel</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The namespace of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GetOpaClusterNamespaceList~~">GetOpaClusterNamespaceList</a> operation to query the namespaces of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
