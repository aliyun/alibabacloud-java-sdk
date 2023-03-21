// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanRequest extends TeaModel {
    @NameInMap("Database")
    public String database;

    @NameInMap("InstanceUuid")
    public String instanceUuid;

    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("ResetScn")
    public String resetScn;

    @NameInMap("ResetTime")
    public String resetTime;

    @NameInMap("RestoreInfo")
    public String restoreInfo;

    @NameInMap("TimePoint")
    public Long timePoint;

    public static CreateUniRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanRequest self = new CreateUniRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateUniRestorePlanRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public CreateUniRestorePlanRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateUniRestorePlanRequest setResetScn(String resetScn) {
        this.resetScn = resetScn;
        return this;
    }
    public String getResetScn() {
        return this.resetScn;
    }

    public CreateUniRestorePlanRequest setResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }
    public String getResetTime() {
        return this.resetTime;
    }

    public CreateUniRestorePlanRequest setRestoreInfo(String restoreInfo) {
        this.restoreInfo = restoreInfo;
        return this;
    }
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

    public CreateUniRestorePlanRequest setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public Long getTimePoint() {
        return this.timePoint;
    }

}
