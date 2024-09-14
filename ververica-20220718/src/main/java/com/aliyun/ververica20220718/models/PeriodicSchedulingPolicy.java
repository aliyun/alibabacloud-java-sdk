// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class PeriodicSchedulingPolicy extends TeaModel {
    @NameInMap("isFinished")
    public Boolean isFinished;

    /**
     * <strong>example:</strong>
     * <p>1723195800000</p>
     */
    @NameInMap("onlyOnceTriggerTime")
    public Long onlyOnceTriggerTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("onlyOnceTriggerTimeIsExpired")
    public Boolean onlyOnceTriggerTimeIsExpired;

    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("periodicSchedulingLevel")
    public String periodicSchedulingLevel;

    @NameInMap("periodicSchedulingValues")
    public java.util.List<Integer> periodicSchedulingValues;

    /**
     * <strong>example:</strong>
     * <p>1723199340000</p>
     */
    @NameInMap("periodicTriggerTime")
    public Long periodicTriggerTime;

    @NameInMap("resourceSetting")
    public BriefResourceSetting resourceSetting;

    public static PeriodicSchedulingPolicy build(java.util.Map<String, ?> map) throws Exception {
        PeriodicSchedulingPolicy self = new PeriodicSchedulingPolicy();
        return TeaModel.build(map, self);
    }

    public PeriodicSchedulingPolicy setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
        return this;
    }
    public Boolean getIsFinished() {
        return this.isFinished;
    }

    public PeriodicSchedulingPolicy setOnlyOnceTriggerTime(Long onlyOnceTriggerTime) {
        this.onlyOnceTriggerTime = onlyOnceTriggerTime;
        return this;
    }
    public Long getOnlyOnceTriggerTime() {
        return this.onlyOnceTriggerTime;
    }

    public PeriodicSchedulingPolicy setOnlyOnceTriggerTimeIsExpired(Boolean onlyOnceTriggerTimeIsExpired) {
        this.onlyOnceTriggerTimeIsExpired = onlyOnceTriggerTimeIsExpired;
        return this;
    }
    public Boolean getOnlyOnceTriggerTimeIsExpired() {
        return this.onlyOnceTriggerTimeIsExpired;
    }

    public PeriodicSchedulingPolicy setPeriodicSchedulingLevel(String periodicSchedulingLevel) {
        this.periodicSchedulingLevel = periodicSchedulingLevel;
        return this;
    }
    public String getPeriodicSchedulingLevel() {
        return this.periodicSchedulingLevel;
    }

    public PeriodicSchedulingPolicy setPeriodicSchedulingValues(java.util.List<Integer> periodicSchedulingValues) {
        this.periodicSchedulingValues = periodicSchedulingValues;
        return this;
    }
    public java.util.List<Integer> getPeriodicSchedulingValues() {
        return this.periodicSchedulingValues;
    }

    public PeriodicSchedulingPolicy setPeriodicTriggerTime(Long periodicTriggerTime) {
        this.periodicTriggerTime = periodicTriggerTime;
        return this;
    }
    public Long getPeriodicTriggerTime() {
        return this.periodicTriggerTime;
    }

    public PeriodicSchedulingPolicy setResourceSetting(BriefResourceSetting resourceSetting) {
        this.resourceSetting = resourceSetting;
        return this;
    }
    public BriefResourceSetting getResourceSetting() {
        return this.resourceSetting;
    }

}
