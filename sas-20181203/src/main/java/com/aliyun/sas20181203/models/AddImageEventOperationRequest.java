// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationRequest extends TeaModel {
    /**
     * <p>The rule conditions. The value is in the JSON format. Valid values of keys:</p>
     * <ul>
     * <li><strong>condition</strong>: the matching condition.</li>
     * <li><strong>type</strong>: the matching type.</li>
     * <li><strong>value</strong>: the matching value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;condition\&quot;: \&quot;MD5\&quot;, \&quot;type\&quot;: \&quot;equals\&quot;, \&quot;value\&quot;: \&quot;0083a31cc0083a31ccf7c10367a6e783e\&quot;}]</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The keyword of the alert item.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the alert item.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert type.</p>
     * <ul>
     * <li>Set the value to <strong>sensitiveFile</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sensitiveFile</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The remarks that you want to add.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The operation code.</p>
     * <ul>
     * <li>Set the value to <strong>whitelist</strong> to add the alert item to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The application scope of the rule. The value is in the JSON format. Valid values of keys:</p>
     * <ul>
     * <li><strong>type</strong></li>
     * <li><strong>value</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;type\&quot;: \&quot;repo\&quot;, \&quot;value\&quot;: \&quot;test-aaa/shenzhen-repo-01\&quot;}</p>
     */
    @NameInMap("Scenarios")
    public String scenarios;

    /**
     * <p>The source of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: image.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

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

    public AddImageEventOperationRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
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

    public AddImageEventOperationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
