// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class JobInstance extends TeaModel {
    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784045339385</p>
     */
    @NameInMap("beginTimeInMillis")
    public Long beginTimeInMillis;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784045339385</p>
     */
    @NameInMap("createTimeInMillis")
    public Long createTimeInMillis;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>加工作业</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>filter-get-request</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>401</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>QueryErr(InvalidQuery): invalid metric keys provided: [metric_key1, metric_key2]</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>467b2b2cb7de2a9-656946cb235f3-52f6f88</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>alimm_onebp_dtc_scs_prod_m_i_1561_p_x_1</p>
     */
    @NameInMap("jobName")
    public String jobName;

    /**
     * <p>The scheduled task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5a4093d6cb4ed7e8bca3745b221af4c8</p>
     */
    @NameInMap("jobScheduleId")
    public String jobScheduleId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("result")
    public String result;

    /**
     * <p>The scheduled time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784045339385</p>
     */
    @NameInMap("scheduleTimeInMillis")
    public Long scheduleTimeInMillis;

    /**
     * <p>The current execution status.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The schedule title.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;pubNet\&quot;:0,\&quot;queryId\&quot;:\&quot;6A565F1DD71457AD541DEC77_76\&quot;,\&quot;shipBytes\&quot;:0,\&quot;shipLines\&quot;:0,\&quot;sqlCPUMillis\&quot;:0,\&quot;sqlCostMillis\&quot;:0,\&quot;sqlFromTime\&quot;:1784041200,\&quot;sqlProcessedBytes\&quot;:0,\&quot;sqlProcessedLines\&quot;:0,\&quot;sqlProgress\&quot;:\&quot;\&quot;,\&quot;sqlResultLines\&quot;:0,\&quot;sqlState\&quot;:\&quot;FAILED\&quot;,\&quot;sqlToTime\&quot;:1784044800,\&quot;userInfo\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1784045339385</p>
     */
    @NameInMap("updateTimeInMillis")
    public Long updateTimeInMillis;

    public static JobInstance build(java.util.Map<String, ?> map) throws Exception {
        JobInstance self = new JobInstance();
        return TeaModel.build(map, self);
    }

    public JobInstance setBeginTimeInMillis(Long beginTimeInMillis) {
        this.beginTimeInMillis = beginTimeInMillis;
        return this;
    }
    public Long getBeginTimeInMillis() {
        return this.beginTimeInMillis;
    }

    public JobInstance setCreateTimeInMillis(Long createTimeInMillis) {
        this.createTimeInMillis = createTimeInMillis;
        return this;
    }
    public Long getCreateTimeInMillis() {
        return this.createTimeInMillis;
    }

    public JobInstance setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public JobInstance setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public JobInstance setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public JobInstance setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public JobInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public JobInstance setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public JobInstance setJobScheduleId(String jobScheduleId) {
        this.jobScheduleId = jobScheduleId;
        return this;
    }
    public String getJobScheduleId() {
        return this.jobScheduleId;
    }

    public JobInstance setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public JobInstance setScheduleTimeInMillis(Long scheduleTimeInMillis) {
        this.scheduleTimeInMillis = scheduleTimeInMillis;
        return this;
    }
    public Long getScheduleTimeInMillis() {
        return this.scheduleTimeInMillis;
    }

    public JobInstance setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public JobInstance setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public JobInstance setUpdateTimeInMillis(Long updateTimeInMillis) {
        this.updateTimeInMillis = updateTimeInMillis;
        return this;
    }
    public Long getUpdateTimeInMillis() {
        return this.updateTimeInMillis;
    }

}
