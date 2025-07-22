// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsAsyncShrinkRequest extends TeaModel {
    @NameInMap("CallingNumber")
    public String callingNumberShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12f3dd08-0c55-44ce-9b64-e69d35ed3a76</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobsJson")
    public String jobsJsonShrink;

    /**
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
