// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateBackupPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ExpireDays")
    public Integer expireDays;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Hour")
    public Integer hour;

    /**
     * <strong>example:</strong>
     * <p>c-0104730e9de40215</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Minute")
    public Integer minute;

    /**
     * <strong>example:</strong>
     * <p>bk-9812023</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RecurrenceValues")
    public java.util.List<Integer> recurrenceValues;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static UpdateBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupPolicyRequest self = new UpdateBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupPolicyRequest setExpireDays(Integer expireDays) {
        this.expireDays = expireDays;
        return this;
    }
    public Integer getExpireDays() {
        return this.expireDays;
    }

    public UpdateBackupPolicyRequest setHour(Integer hour) {
        this.hour = hour;
        return this;
    }
    public Integer getHour() {
        return this.hour;
    }

    public UpdateBackupPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateBackupPolicyRequest setMinute(Integer minute) {
        this.minute = minute;
        return this;
    }
    public Integer getMinute() {
        return this.minute;
    }

    public UpdateBackupPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateBackupPolicyRequest setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
        this.recurrenceValues = recurrenceValues;
        return this;
    }
    public java.util.List<Integer> getRecurrenceValues() {
        return this.recurrenceValues;
    }

    public UpdateBackupPolicyRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
