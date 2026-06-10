// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsAsyncShrinkRequest extends TeaModel {
    /**
     * <p>The list of calling numbers to be displayed to callees.</p>
     * <blockquote>
     * <p>If you omit this parameter, the system uses all available calling numbers by default.</p>
     * </blockquote>
     */
    @NameInMap("CallingNumber")
    public String callingNumberShrink;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the job group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <p>A JSON array containing job data. For the required format, see the example.</p>
     * <p>Each JSON object in the array represents a job for a single contact.</p>
     */
    @NameInMap("JobsJson")
    public String jobsJsonShrink;

    /**
     * <p>A JSON string that defines the job group execution strategy. This object has the following properties:</p>
     * <ul>
     * <li><code>repeatBy</code></li>
     * </ul>
     * <p>Specifies the repetition frequency. Valid values include <code>Once</code> (does not repeat), <code>Day</code> (repeats daily), <code>Week</code> (repeats weekly), and <code>Month</code> (repeats monthly).</p>
     * <ul>
     * <li><code>startTime</code></li>
     * </ul>
     * <p>The start time of the execution strategy.</p>
     * <ul>
     * <li><code>endTime</code></li>
     * </ul>
     * <p>The end time of the execution strategy.</p>
     * <ul>
     * <li><code>workingTime</code></li>
     * </ul>
     * <p>The time range during which outbound calls can be made.</p>
     * <ul>
     * <li><code>maxAttemptsPerDay</code></li>
     * </ul>
     * <p>The maximum number of daily call attempts for a single phone number.</p>
     * <ul>
     * <li><code>minAttemptInterval</code></li>
     * </ul>
     * <p>The minimum interval between retry attempts, in minutes.</p>
     * <ul>
     * <li><code>routingStrategy</code></li>
     * </ul>
     * <p>The routing strategy for calling numbers. Valid values: <code>None</code> (not specified), <code>LocalFirst</code> (prioritizes numbers in the same city), and <code>LocalProvinceFirst</code> (prioritizes numbers in the same province).</p>
     * <ul>
     * <li><code>repeatDays</code></li>
     * </ul>
     * <p>The days on which the job repeats. If <code>repeatBy</code> is set to <code>Week</code>, valid values are <code>0</code> for Sunday and <code>1</code> to <code>6</code> for Monday to Saturday. If <code>repeatBy</code> is set to <code>Month</code>, valid values are <code>1</code> to <code>31</code>. If a specified day does not exist in a given month (e.g., February 30), the job is skipped for that month.</p>
     * <ul>
     * <li><code>repeatable</code></li>
     * </ul>
     * <p>Specifies whether to enable recurring jobs. Valid values: <code>true</code> and <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;maxAttemptsPerDay&quot;:&quot;3&quot;,&quot;minAttemptInterval&quot;:&quot;10&quot;,&quot;routingStrategy&quot;:&quot;LocalProvinceFirst&quot;,&quot;repeatDays&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;],&quot;workingTime&quot;:[{&quot;beginTime&quot;:&quot;10:00:00&quot;,&quot;endTime&quot;:&quot;11:00:00&quot;},{&quot;beginTime&quot;:&quot;14:00:00&quot;,&quot;endTime&quot;:&quot;15:00:00&quot;}],&quot;repeatable&quot;:true,&quot;endTime&quot;:1707494400000,&quot;startTime&quot;:1706976000000,&quot;repeatBy&quot;:&quot;Week&quot;}</p>
     */
    @NameInMap("StrategyJson")
    public String strategyJson;

    public static AssignJobsAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsAsyncShrinkRequest self = new AssignJobsAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AssignJobsAsyncShrinkRequest setCallingNumberShrink(String callingNumberShrink) {
        this.callingNumberShrink = callingNumberShrink;
        return this;
    }
    public String getCallingNumberShrink() {
        return this.callingNumberShrink;
    }

    public AssignJobsAsyncShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignJobsAsyncShrinkRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public AssignJobsAsyncShrinkRequest setJobsJsonShrink(String jobsJsonShrink) {
        this.jobsJsonShrink = jobsJsonShrink;
        return this;
    }
    public String getJobsJsonShrink() {
        return this.jobsJsonShrink;
    }

    public AssignJobsAsyncShrinkRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

}
