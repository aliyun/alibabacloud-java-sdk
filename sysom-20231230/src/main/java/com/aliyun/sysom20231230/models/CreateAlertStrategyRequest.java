// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("k8sLabel")
    public Boolean k8sLabel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>strategy1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("strategy")
    public CreateAlertStrategyRequestStrategy strategy;

    public static CreateAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertStrategyRequest self = new CreateAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertStrategyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateAlertStrategyRequest setK8sLabel(Boolean k8sLabel) {
        this.k8sLabel = k8sLabel;
        return this;
    }
    public Boolean getK8sLabel() {
        return this.k8sLabel;
    }

    public CreateAlertStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertStrategyRequest setStrategy(CreateAlertStrategyRequestStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public CreateAlertStrategyRequestStrategy getStrategy() {
        return this.strategy;
    }

    public static class CreateAlertStrategyRequestStrategy extends TeaModel {
        @NameInMap("clusters")
        public java.util.List<String> clusters;

        @NameInMap("items")
        public java.util.List<String> items;

        public static CreateAlertStrategyRequestStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertStrategyRequestStrategy self = new CreateAlertStrategyRequestStrategy();
            return TeaModel.build(map, self);
        }

        public CreateAlertStrategyRequestStrategy setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public CreateAlertStrategyRequestStrategy setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
