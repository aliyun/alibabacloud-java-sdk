// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationRequest extends TeaModel {
    /**
     * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
     * <br>
     * <p>*   **condition**: the matching condition.</p>
     * <p>*   **type**: the matching type.</p>
     * <p>*   **value**: the matching value.</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The keyword of the alert item.</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the alert item.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert type.</p>
     * <br>
     * <p>*   Set the value to **sensitiveFile**.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The operation code.</p>
     * <br>
     * <p>*   Set the value to **whitelist** to add the alert item to the whitelist.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
     * <br>
     * <p>*   **type**</p>
     * <p>*   **value**</p>
     */
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
