// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class AddBackupPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ExpireDays")
    public Integer expireDays;

    /**
     * <strong>example:</strong>
     * <p>2</p>
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
     * <p>30</p>
     */
    @NameInMap("Minute")
    public Integer minute;

    /**
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    @NameInMap("RecurrenceValues")
    public java.util.List<Integer> recurrenceValues;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static AddBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBackupPolicyRequest self = new AddBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public AddBackupPolicyRequest setExpireDays(Integer expireDays) {
        this.expireDays = expireDays;
        return this;
    }
    public Integer getExpireDays() {
        return this.expireDays;
    }

    public AddBackupPolicyRequest setHour(Integer hour) {
        this.hour = hour;
        return this;
    }
    public Integer getHour() {
        return this.hour;
    }

    public AddBackupPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddBackupPolicyRequest setMinute(Integer minute) {
        this.minute = minute;
        return this;
    }
    public Integer getMinute() {
        return this.minute;
    }

    public AddBackupPolicyRequest setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public AddBackupPolicyRequest setRecurrenceValues(java.util.List<Integer> recurrenceValues) {
        this.recurrenceValues = recurrenceValues;
        return this;
    }
    public java.util.List<Integer> getRecurrenceValues() {
        return this.recurrenceValues;
    }

    public AddBackupPolicyRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
