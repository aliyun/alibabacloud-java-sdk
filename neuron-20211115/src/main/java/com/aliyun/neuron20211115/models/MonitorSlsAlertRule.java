// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorSlsAlertRule extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>规则1</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li>| select status, count(*) as total group by status</li>
     * </ul>
     */
    @NameInMap("queryCondition")
    public String queryCondition;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("triggerInterval")
    public Long triggerInterval;

    /**
     * <strong>example:</strong>
     * <p>MINUTE</p>
     */
    @NameInMap("triggerIntervalUnit")
    public String triggerIntervalUnit;

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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
