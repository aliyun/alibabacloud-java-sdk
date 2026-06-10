// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsRequest extends TeaModel {
    /**
     * <p>These numbers are displayed as the caller ID to the contact.</p>
     * <blockquote>
     * <p>If unspecified, all available calling numbers are used.</p>
     * </blockquote>
     */
    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the task is asynchronous.</p>
     * <p>You can omit this parameter if you create jobs by calling this API. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAsynchrony")
    public Boolean isAsynchrony;

    /**
     * <p>The ID of the data parsing task for the outbound call job.</p>
     * <p>You can omit this parameter if you create jobs by calling this API.</p>
     * <blockquote>
     * <p>If you create jobs by uploading a file, you must call the <code>CreateJobDataParsingTask</code> operation to obtain a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobDataParsingTaskId")
    public String jobDataParsingTaskId;

    /**
     * <p>The job group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * <p>The job data, a JSON array where each object represents a contact. For formatting details, see the example.</p>
     * <p>The array can contain up to 99 elements.</p>
     */
    @NameInMap("JobsJson")
    public java.util.List<String> jobsJson;

    /**
     * <p>The roster type.</p>
     * <p>If you create jobs by calling this API, you can omit this parameter. The default value is <code>json</code>. If you upload a contact list file, set this parameter to <code>excel</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("RosterType")
    public String rosterType;

    /**
     * <p>The execution strategy for the job group.</p>
     * <ul>
     * <li><p><code>repeatBy</code>: The recurrence type. Valid values: <code>Once</code> (runs once), <code>Day</code> (repeats daily), <code>Week</code> (repeats weekly), and <code>Month</code> (repeats monthly).</p>
     * </li>
     * <li><p><code>startTime</code>: The start time of the strategy.</p>
     * </li>
     * <li><p><code>endTime</code>: The end time of the strategy.</p>
     * </li>
     * <li><p><code>workingTime</code>: The time windows during which calls can be made.</p>
     * </li>
     * <li><p><code>maxAttemptsPerDay</code>: The maximum daily call attempts per phone number.</p>
     * </li>
     * <li><p><code>minAttemptInterval</code>: The minimum interval between call retries, in minutes.</p>
     * </li>
     * <li><p><code>routingStrategy</code>: The number routing strategy. Valid values: <code>None</code> (no preference), <code>LocalFirst</code> (prioritizes numbers in the same city), and <code>LocalProvinceFirst</code> (prioritizes numbers in the same province).</p>
     * </li>
     * <li><p><code>repeatDays</code>: The specific days on which the job runs, based on the <code>repeatBy</code> type. If <code>repeatBy</code> is set to <code>Week</code>, <code>0</code> represents Sunday, and <code>1</code> through <code>6</code> represent Monday through Saturday. If <code>repeatBy</code> is set to <code>Month</code>, values from <code>1</code> to <code>31</code> represent the days of the month. If a month does not have a specified day (for example, February 30), the job is skipped for that month.</p>
     * </li>
     * <li><p><code>repeatable</code>: Specifies whether the job is recurring. Valid values are <code>true</code> and <code>false</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    public static AssignJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsRequest self = new AssignJobsRequest();
        return TeaModel.build(map, self);
    }

    public AssignJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public AssignJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignJobsRequest setIsAsynchrony(Boolean isAsynchrony) {
        this.isAsynchrony = isAsynchrony;
        return this;
    }
    public Boolean getIsAsynchrony() {
        return this.isAsynchrony;
    }

    public AssignJobsRequest setJobDataParsingTaskId(String jobDataParsingTaskId) {
        this.jobDataParsingTaskId = jobDataParsingTaskId;
        return this;
    }
    public String getJobDataParsingTaskId() {
        return this.jobDataParsingTaskId;
    }

    public AssignJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public AssignJobsRequest setJobsJson(java.util.List<String> jobsJson) {
        this.jobsJson = jobsJson;
        return this;
    }
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

    public AssignJobsRequest setRosterType(String rosterType) {
        this.rosterType = rosterType;
        return this;
    }
    public String getRosterType() {
        return this.rosterType;
    }

    public AssignJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
