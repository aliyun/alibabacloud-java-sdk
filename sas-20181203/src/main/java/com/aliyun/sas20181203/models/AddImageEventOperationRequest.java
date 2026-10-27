// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageEventOperationRequest extends TeaModel {
    /**
     * <p>The rule conditions. The value is in JSON format. Valid keys:</p>
     * <ul>
     * <li><strong>condition</strong>: The matching condition.</li>
     * <li><strong>type</strong>: The matching type.</li>
     * <li><strong>value</strong>: The matching value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;condition\&quot;: \&quot;MD5\&quot;, \&quot;type\&quot;: \&quot;equals\&quot;, \&quot;value\&quot;: \&quot;0083a31cc0083a31ccf7c10367a6e783e\&quot;}]</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>The alert metric keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The alert metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The Alarm Metric for alerting. Valid values:</p>
     * <ul>
     * <li><strong>sensitiveFile</strong>: Sensitive file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sensitiveFile</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The note to add.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>The operation code. Valid values:</p>
     * <ul>
     * <li><strong>whitelist</strong>: Whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The rule scope. The value is in JSON format. Valid keys:</p>
     * <ul>
     * <li><strong>type</strong>: The scope type.</li>
     * <li><strong>value</strong>: The scope value.<blockquote>
     * <p>This parameter and <strong>Source</strong> cannot be empty at the same time. If <strong>Source</strong> is set to <strong>agentless</strong>, this parameter does not take effect.</p>
     * </blockquote>
     * </li>
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
     * <li><strong>image</strong>: Image.</li>
     * <li><strong>agentless</strong>: Agentless detection.<blockquote>
     * <p>This parameter and <strong>Scenarios</strong> cannot be empty at the same time. If this parameter is set to <strong>agentless</strong>, the <strong>Scenarios</strong> parameter does not take effect.</p>
     * </blockquote>
     * </li>
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
