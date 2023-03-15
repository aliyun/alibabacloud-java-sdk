// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMqAlertRule extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("metricDimension")
    public String metricDimension;

    @NameInMap("metricKey")
    public String metricKey;

    @NameInMap("metricType")
    public String metricType;

    @NameInMap("name")
    public String name;

    @NameInMap("triggerInterval")
    public Long triggerInterval;

    @NameInMap("triggerOperator")
    public String triggerOperator;

    @NameInMap("triggerThreshold")
    public Long triggerThreshold;

    public static MonitorMqAlertRule build(java.util.Map<String, ?> map) throws Exception {
        MonitorMqAlertRule self = new MonitorMqAlertRule();
        return TeaModel.build(map, self);
    }

    public MonitorMqAlertRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorMqAlertRule setMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }
    public String getMetricDimension() {
        return this.metricDimension;
    }

    public MonitorMqAlertRule setMetricKey(String metricKey) {
        this.metricKey = metricKey;
        return this;
    }
    public String getMetricKey() {
        return this.metricKey;
    }

    public MonitorMqAlertRule setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public MonitorMqAlertRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorMqAlertRule setTriggerInterval(Long triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

    public MonitorMqAlertRule setTriggerOperator(String triggerOperator) {
        this.triggerOperator = triggerOperator;
        return this;
    }
    public String getTriggerOperator() {
        return this.triggerOperator;
    }

    public MonitorMqAlertRule setTriggerThreshold(Long triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }
    public Long getTriggerThreshold() {
        return this.triggerThreshold;
    }

}
