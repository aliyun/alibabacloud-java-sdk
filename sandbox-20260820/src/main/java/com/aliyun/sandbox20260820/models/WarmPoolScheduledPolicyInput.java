// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class WarmPoolScheduledPolicyInput extends TeaModel {
    /**
     * <p>The end time when the rule expires, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12-31T23:59:59Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The name of the scheduled rule. It must be unique within the same warm pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>daily-scale</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The cron expression for the scheduled rule, in the cron (second minute hour day month week) format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cron(0 0 0 * * *)</p>
     */
    @NameInMap("scheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The start time when the rule takes effect, in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-12-01T00:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The target number of ready sandboxes after the rule is triggered. The value can be 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("target")
    public Long target;

    /**
     * <p>The IANA time zone used to execute the scheduled rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    public static WarmPoolScheduledPolicyInput build(java.util.Map<String, ?> map) throws Exception {
        WarmPoolScheduledPolicyInput self = new WarmPoolScheduledPolicyInput();
        return TeaModel.build(map, self);
    }

    public WarmPoolScheduledPolicyInput setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public WarmPoolScheduledPolicyInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WarmPoolScheduledPolicyInput setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public WarmPoolScheduledPolicyInput setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public WarmPoolScheduledPolicyInput setTarget(Long target) {
        this.target = target;
        return this;
    }
    public Long getTarget() {
        return this.target;
    }

    public WarmPoolScheduledPolicyInput setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
