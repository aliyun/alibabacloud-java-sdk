// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("EventKey")
    public String eventKey;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("OperationCode")
    public String operationCode;

    @NameInMap("Scenarios")
    public String scenarios;

    public static AddImageEventOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddImageEventOperationRequest self = new AddImageEventOperationRequest();
        return TeaModel.build(map, self);
    }

    public AddImageEventOperationRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public AddImageEventOperationRequest setEventKey(String eventKey) {
        this.eventKey = eventKey;
        return this;
    }
    public String getEventKey() {
        return this.eventKey;
    }

    public AddImageEventOperationRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public AddImageEventOperationRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public AddImageEventOperationRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public AddImageEventOperationRequest setScenarios(String scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public String getScenarios() {
        return this.scenarios;
    }

}
