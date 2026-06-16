// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSimulationTaskRequest extends TeaModel {
    /**
     * <p>The language type for the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The datasource config.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("dataSourceConfig")
    public String dataSourceConfig;

    /**
     * <p>The data source type.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>The end time, in milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735541040000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de_anbwns2231</p>
     */
    @NameInMap("eventCode")
    public String eventCode;

    /**
     * <p>The filter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;left&quot;:&quot;score&quot;,&quot;operate&quot;:&quot;bw&quot;,&quot;right&quot;:&quot;222,333&quot;}</p>
     */
    @NameInMap("filtersStr")
    public String filtersStr;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The list of policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;100234\&quot;]</p>
     */
    @NameInMap("rulesStr")
    public String rulesStr;

    /**
     * <p>Specifies whether to run the task immediately.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("runTask")
    public Boolean runTask;

    /**
     * <p>The start time, in milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1730448000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>仿真任务</p>
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
