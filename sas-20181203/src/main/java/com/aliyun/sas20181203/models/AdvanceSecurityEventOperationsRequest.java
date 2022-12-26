// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsRequest extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RuleId")
    public Integer ruleId;

    public static AdvanceSecurityEventOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        AdvanceSecurityEventOperationsRequest self = new AdvanceSecurityEventOperationsRequest();
        return TeaModel.build(map, self);
    }

    public AdvanceSecurityEventOperationsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public AdvanceSecurityEventOperationsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public AdvanceSecurityEventOperationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AdvanceSecurityEventOperationsRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

}
