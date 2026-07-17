// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateElasticPlanRequest extends TeaModel {
    @NameInMap("customDates")
    public java.util.List<String> customDates;

    /**
     * <strong>example:</strong>
     * <p>my elastic plan</p>
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
     * <p>13</p>
     */
    @NameInMap("endHour")
    public Integer endHour;

    /**
     * <strong>example:</strong>
     * <p>elastic_plan_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>WEEK</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("startHour")
    public Integer startHour;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticPlanRequest self = new CreateElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticPlanRequest setCustomDates(java.util.List<String> customDates) {
        this.customDates = customDates;
        return this;
    }
    public java.util.List<String> getCustomDates() {
        return this.customDates;
    }

    public CreateElasticPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateElasticPlanRequest setElasticLcu(Integer elasticLcu) {
        this.elasticLcu = elasticLcu;
        return this;
    }
    public Integer getElasticLcu() {
        return this.elasticLcu;
    }

    public CreateElasticPlanRequest setEndHour(Integer endHour) {
        this.endHour = endHour;
        return this;
    }
    public Integer getEndHour() {
        return this.endHour;
    }

    public CreateElasticPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateElasticPlanRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateElasticPlanRequest setStartHour(Integer startHour) {
        this.startHour = startHour;
        return this;
    }
    public Integer getStartHour() {
        return this.startHour;
    }

    public CreateElasticPlanRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
