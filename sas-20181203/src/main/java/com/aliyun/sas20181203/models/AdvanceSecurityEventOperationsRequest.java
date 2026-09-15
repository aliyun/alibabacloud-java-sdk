// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The alert name. The EventName and EventType parameters must be specified together. If only one of them is specified, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>Malicious script code execution</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The type of the alerting event. Valid values:</p>
     * <ul>
     * <li>Abnormal process behavior</li>
     * <li>Web shell</li>
     * <li>Unusual logon</li>
     * <li>Abnormal event</li>
     * <li>Sensitive file tampering</li>
     * <li>Malicious process (cloud scan)</li>
     * <li>Suspicious network connection</li>
     * <li>Abnormal account</li>
     * <li>Application intrusion event</li>
     * <li>Cloud service threat detection</li>
     * <li>Precise defense</li>
     * <li>Application whitelist</li>
     * <li>Persistent backdoor</li>
     * <li>Web application threat detection</li>
     * <li>Malicious script</li>
     * <li>Threat intelligence</li>
     * <li>Malicious network behavior</li>
     * <li>Container cluster exception</li>
     * <li>Web shell (local scan)</li>
     * <li>Vulnerability exploits</li>
     * <li>Malicious process (local scan)</li>
     * <li>Trusted exception</li>
     * <li>Other</li>
     * </ul>
     * <p>For more information about alert types, see <a href="https://help.aliyun.com/document_detail/68388.html">Security alert check items</a>.</p>
     * <p>The EventName and EventType parameters must be specified together. If only one of them is specified, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>Malicious script</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The member account ID in the resource directory (Alibaba Cloud account).</p>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public AdvanceSecurityEventOperationsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
