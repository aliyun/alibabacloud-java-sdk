// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorSlsAlertRule extends TeaModel {
    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("queryCondition")
    public String queryCondition;

    @NameInMap("triggerInterval")
    public Long triggerInterval;

    @NameInMap("triggerIntervalUnit")
    public String triggerIntervalUnit;

    @NameInMap("triggerOperator")
    public String triggerOperator;

    @NameInMap("triggerThreshold")
    public Long triggerThreshold;

    @NameInMap("triggerThresholdUpper")
    public Long triggerThresholdUpper;

    public static MonitorSlsAlertRule build(java.util.Map<String, ?> map) throws Exception {
        MonitorSlsAlertRule self = new MonitorSlsAlertRule();
        return TeaModel.build(map, self);
    }

    public MonitorSlsAlertRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorSlsAlertRule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorSlsAlertRule setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public MonitorSlsAlertRule setTriggerInterval(Long triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

    public MonitorSlsAlertRule setTriggerIntervalUnit(String triggerIntervalUnit) {
        this.triggerIntervalUnit = triggerIntervalUnit;
        return this;
    }
    public String getTriggerIntervalUnit() {
        return this.triggerIntervalUnit;
    }

    public MonitorSlsAlertRule setTriggerOperator(String triggerOperator) {
        this.triggerOperator = triggerOperator;
        return this;
    }
    public String getTriggerOperator() {
        return this.triggerOperator;
    }

    public MonitorSlsAlertRule setTriggerThreshold(Long triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }
    public Long getTriggerThreshold() {
        return this.triggerThreshold;
    }

    public MonitorSlsAlertRule setTriggerThresholdUpper(Long triggerThresholdUpper) {
        this.triggerThresholdUpper = triggerThresholdUpper;
        return this;
    }
    public Long getTriggerThresholdUpper() {
        return this.triggerThresholdUpper;
    }

}
