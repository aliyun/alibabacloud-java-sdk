// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanRequest extends TeaModel {
    @NameInMap("customDates")
    public java.util.List<String> customDates;

    /**
     * <strong>example:</strong>
     * <p>Updated description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("elasticLcu")
    public Integer elasticLcu;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("endHour")
    public Integer endHour;

    /**
     * <strong>example:</strong>
     * <p>WEEK</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("startHour")
    public Integer startHour;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanRequest self = new ModifyElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanRequest setCustomDates(java.util.List<String> customDates) {
        this.customDates = customDates;
        return this;
    }
    public java.util.List<String> getCustomDates() {
        return this.customDates;
    }

    public ModifyElasticPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyElasticPlanRequest setElasticLcu(Integer elasticLcu) {
        this.elasticLcu = elasticLcu;
        return this;
    }
    public Integer getElasticLcu() {
        return this.elasticLcu;
    }

    public ModifyElasticPlanRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyElasticPlanRequest setEndHour(Integer endHour) {
        this.endHour = endHour;
        return this;
    }
    public Integer getEndHour() {
        return this.endHour;
    }

    public ModifyElasticPlanRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public ModifyElasticPlanRequest setStartHour(Integer startHour) {
        this.startHour = startHour;
        return this;
    }
    public Integer getStartHour() {
        return this.startHour;
    }

    public ModifyElasticPlanRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
