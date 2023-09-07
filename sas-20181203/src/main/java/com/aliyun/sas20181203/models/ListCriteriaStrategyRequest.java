// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("Label")
    public String label;

    @NameInMap("Namespace")
    public String namespace;

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
