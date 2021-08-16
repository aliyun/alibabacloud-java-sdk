// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TimePoint")
    public Long timePoint;

    @NameInMap("PolicyId")
    public Long policyId;

    @NameInMap("Database")
    public String database;

    @NameInMap("InstanceUuid")
    public String instanceUuid;

    @NameInMap("ResetTime")
    public String resetTime;

    @NameInMap("ResetScn")
    public String resetScn;

    @NameInMap("RestoreInfo")
    public String restoreInfo;

    public static CreateUniRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanRequest self = new CreateUniRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateUniRestorePlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUniRestorePlanRequest setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public Long getTimePoint() {
        return this.timePoint;
    }

    public CreateUniRestorePlanRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
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

    public CreateUniRestorePlanRequest setResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }
    public String getResetTime() {
        return this.resetTime;
    }

    public CreateUniRestorePlanRequest setResetScn(String resetScn) {
        this.resetScn = resetScn;
        return this;
    }
    public String getResetScn() {
        return this.resetScn;
    }

    public CreateUniRestorePlanRequest setRestoreInfo(String restoreInfo) {
        this.restoreInfo = restoreInfo;
        return this;
    }
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

}
