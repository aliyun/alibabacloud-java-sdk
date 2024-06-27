// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSimulationTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("dataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("filtersStr")
    public String filtersStr;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("rulesStr")
    public String rulesStr;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("runTask")
    public Boolean runTask;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static CreateSimulationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulationTaskRequest self = new CreateSimulationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimulationTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSimulationTaskRequest setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public CreateSimulationTaskRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateSimulationTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSimulationTaskRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public CreateSimulationTaskRequest setFiltersStr(String filtersStr) {
        this.filtersStr = filtersStr;
        return this;
    }
    public String getFiltersStr() {
        return this.filtersStr;
    }

    public CreateSimulationTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSimulationTaskRequest setRulesStr(String rulesStr) {
        this.rulesStr = rulesStr;
        return this;
    }
    public String getRulesStr() {
        return this.rulesStr;
    }

    public CreateSimulationTaskRequest setRunTask(Boolean runTask) {
        this.runTask = runTask;
        return this;
    }
    public Boolean getRunTask() {
        return this.runTask;
    }

    public CreateSimulationTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSimulationTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
