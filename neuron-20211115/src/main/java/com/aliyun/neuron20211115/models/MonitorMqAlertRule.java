// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMqAlertRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>PBC_Topic1</p>
     */
    @NameInMap("metricDimension")
    public String metricDimension;

    /**
     * <strong>example:</strong>
     * <p>appstat.jvm.gc.oldgccountinstant</p>
     */
    @NameInMap("metricKey")
    public String metricKey;

    /**
     * <strong>example:</strong>
     * <p>TOPIC</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>规则1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("triggerInterval")
    public Long triggerInterval;

    /**
     * <strong>example:</strong>
     * <p>GreaterThanOrEqualToThreshold</p>
     */
    @NameInMap("triggerOperator")
    public String triggerOperator;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
