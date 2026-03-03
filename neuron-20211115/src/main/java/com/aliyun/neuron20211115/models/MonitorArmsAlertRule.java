// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorArmsAlertRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>appstat.jvm.gc.oldgccountinstant</p>
     */
    @NameInMap("metricKey")
    public String metricKey;

    /**
     * <strong>example:</strong>
     * <p>JVM</p>
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
     * <p>AVG</p>
     */
    @NameInMap("triggerAggregate")
    public String triggerAggregate;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("triggerInterval")
    public Long triggerInterval;

    /**
     * <strong>example:</strong>
     * <p>CURRENT_GTE</p>
     */
    @NameInMap("triggerOperator")
    public String triggerOperator;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("triggerThreshold")
    public Long triggerThreshold;

    public static MonitorArmsAlertRule build(java.util.Map<String, ?> map) throws Exception {
        MonitorArmsAlertRule self = new MonitorArmsAlertRule();
        return TeaModel.build(map, self);
    }

    public MonitorArmsAlertRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorArmsAlertRule setMetricKey(String metricKey) {
        this.metricKey = metricKey;
        return this;
    }
    public String getMetricKey() {
        return this.metricKey;
    }

    public MonitorArmsAlertRule setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public MonitorArmsAlertRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorArmsAlertRule setTriggerAggregate(String triggerAggregate) {
        this.triggerAggregate = triggerAggregate;
        return this;
    }
    public String getTriggerAggregate() {
        return this.triggerAggregate;
    }

    public MonitorArmsAlertRule setTriggerInterval(Long triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

    public MonitorArmsAlertRule setTriggerOperator(String triggerOperator) {
        this.triggerOperator = triggerOperator;
        return this;
    }
    public String getTriggerOperator() {
        return this.triggerOperator;
    }

    public MonitorArmsAlertRule setTriggerThreshold(Long triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }
    public Long getTriggerThreshold() {
        return this.triggerThreshold;
    }

}
