// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The alert name.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert event type. Valid values:</p>
     * <br>
     * <p>*   Suspicious process</p>
     * <p>*   Webshell</p>
     * <p>*   Unusual logon</p>
     * <p>*   Exception</p>
     * <p>*   Sensitive file tampering</p>
     * <p>*   Malicious process (cloud threat detection)</p>
     * <p>*   Unusual network connection</p>
     * <p>*   Abnormal account</p>
     * <p>*   Application intrusion event</p>
     * <p>*   Cloud threat detection</p>
     * <p>*   Precision defense</p>
     * <p>*   Application whitelist</p>
     * <p>*   Persistent webshell</p>
     * <p>*   Web application threat detection</p>
     * <p>*   Malicious script</p>
     * <p>*   Threat intelligence</p>
     * <p>*   Malicious network activity</p>
     * <p>*   Cluster exception</p>
     * <p>*   Webshell (on-premises threat detection)</p>
     * <p>*   Vulnerability exploitation</p>
     * <p>*   Malicious process (on-premises threat detection)</p>
     * <p>*   Trusted exception</p>
     * <p>*   Others</p>
     * <br>
     * <p>For more information about alert types, see [Alerts](https://help.aliyun.com/document_detail/68388.html).</p>
     */
    @NameInMap("EventType")
    public String eventType;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The rule ID.</p>
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
