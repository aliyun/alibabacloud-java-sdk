// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The alert name.</p>
     * 
     * <strong>example:</strong>
     * <p>Execution of malicious script code</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert event type. Valid values:</p>
     * <ul>
     * <li>Suspicious process</li>
     * <li>Webshell</li>
     * <li>Unusual logon</li>
     * <li>Exception</li>
     * <li>Sensitive file tampering</li>
     * <li>Malicious process (cloud threat detection)</li>
     * <li>Unusual network connection</li>
     * <li>Abnormal account</li>
     * <li>Application intrusion event</li>
     * <li>Cloud threat detection</li>
     * <li>Precision defense</li>
     * <li>Application whitelist</li>
     * <li>Persistent webshell</li>
     * <li>Web application threat detection</li>
     * <li>Malicious script</li>
     * <li>Threat intelligence</li>
     * <li>Malicious network activity</li>
     * <li>Cluster exception</li>
     * <li>Webshell (on-premises threat detection)</li>
     * <li>Vulnerability exploitation</li>
     * <li>Malicious process (on-premises threat detection)</li>
     * <li>Trusted exception</li>
     * <li>Others</li>
     * </ul>
     * <p>For more information about alert types, see <a href="https://help.aliyun.com/document_detail/68388.html">Alerts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Malicious script</p>
     */
    @NameInMap("EventType")
    public String eventType;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
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
