// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

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
    public UpdateAlertStrategyRequestStrategy strategy;

    public static UpdateAlertStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertStrategyRequest self = new UpdateAlertStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertStrategyRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateAlertStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlertStrategyRequest setK8sLabel(Boolean k8sLabel) {
        this.k8sLabel = k8sLabel;
        return this;
    }
    public Boolean getK8sLabel() {
        return this.k8sLabel;
    }

    public UpdateAlertStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertStrategyRequest setStrategy(UpdateAlertStrategyRequestStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public UpdateAlertStrategyRequestStrategy getStrategy() {
        return this.strategy;
    }

    public static class UpdateAlertStrategyRequestStrategy extends TeaModel {
        @NameInMap("clusters")
        public java.util.List<String> clusters;

        @NameInMap("items")
        public java.util.List<String> items;

        public static UpdateAlertStrategyRequestStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertStrategyRequestStrategy self = new UpdateAlertStrategyRequestStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateAlertStrategyRequestStrategy setClusters(java.util.List<String> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        public UpdateAlertStrategyRequestStrategy setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
