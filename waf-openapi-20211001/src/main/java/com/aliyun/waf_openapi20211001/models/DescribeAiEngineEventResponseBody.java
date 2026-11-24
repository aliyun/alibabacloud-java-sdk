// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventResponseBody extends TeaModel {
    /**
     * <p>The grouped list of attack sources for the event.</p>
     */
    @NameInMap("AttackSources")
    public java.util.List<DescribeAiEngineEventResponseBodyAttackSources> attackSources;

    /**
     * <p>The statistical value of suspected bypass evidence requests for the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BypassRequestCount")
    public Long bypassRequestCount;

    /**
     * <p>The domain names involved in the event.</p>
     */
    @NameInMap("Domains")
    public java.util.List<String> domains;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EVT-0bda6****6b5cwwz</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The name of the event in the specified language.</p>
     * 
     * <strong>example:</strong>
     * <p>Suspected injection attack</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The number of nodes included in the event.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventNodeCount")
    public Integer eventNodeCount;

    /**
     * <p>The summary of the event in the specified language.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests suspected of injection attacks were detected.</p>
     */
    @NameInMap("EventSummary")
    public String eventSummary;

    /**
     * <p>The statistical value of evidence requests for the event.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("EvidenceRequestCount")
    public Long evidenceRequestCount;

    /**
     * <p>The time when the event was first detected. The time is a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1792973400000</p>
     */
    @NameInMap("FirstSeenAt")
    public Long firstSeenAt;

    /**
     * <p>The current manual handling status. Valid values:</p>
     * <ul>
     * <li><p><strong>unhandled</strong>: Unhandled.</p>
     * </li>
     * <li><p><strong>handling</strong>: Handling.</p>
     * </li>
     * <li><p><strong>handled</strong>: Handled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>unhandled</p>
     */
    @NameInMap("HandleStatus")
    public String handleStatus;

    /**
     * <p>The time when the event was last detected. The time is a UNIX timestamp in UTC. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1792973700000</p>
     */
    @NameInMap("LastSeenAt")
    public Long lastSeenAt;

    /**
     * <p>The IDs of the related events. Multiple IDs are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>EVT-0bda6<strong><strong>6b5c174,EVT-0bda6</strong></strong>6b5c175</p>
     */
    @NameInMap("RelatedEventIds")
    public String relatedEventIds;

    /**
     * <p>The event analysis report in Markdown format in the specified language.</p>
     * 
     * <strong>example:</strong>
     * <h1>Event analysis report</h1>
     * <p>Requests suspected of injection attacks were detected.</p>
     */
    @NameInMap("ReportMarkdown")
    public String reportMarkdown;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-demo</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDs of the protected objects involved in the event.</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    /**
     * <p>The current risk level. Valid values:</p>
     * <ul>
     * <li><p><strong>critical</strong>: Critical.</p>
     * </li>
     * <li><p><strong>high</strong>: High.</p>
     * </li>
     * <li><p><strong>medium</strong>: Medium.</p>
     * </li>
     * <li><p><strong>low</strong>: Low.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    public static DescribeAiEngineEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventResponseBody self = new DescribeAiEngineEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventResponseBody setAttackSources(java.util.List<DescribeAiEngineEventResponseBodyAttackSources> attackSources) {
        this.attackSources = attackSources;
        return this;
    }
    public java.util.List<DescribeAiEngineEventResponseBodyAttackSources> getAttackSources() {
        return this.attackSources;
    }

    public DescribeAiEngineEventResponseBody setBypassRequestCount(Long bypassRequestCount) {
        this.bypassRequestCount = bypassRequestCount;
        return this;
    }
    public Long getBypassRequestCount() {
        return this.bypassRequestCount;
    }

    public DescribeAiEngineEventResponseBody setDomains(java.util.List<String> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    public DescribeAiEngineEventResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeAiEngineEventResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeAiEngineEventResponseBody setEventNodeCount(Integer eventNodeCount) {
        this.eventNodeCount = eventNodeCount;
        return this;
    }
    public Integer getEventNodeCount() {
        return this.eventNodeCount;
    }

    public DescribeAiEngineEventResponseBody setEventSummary(String eventSummary) {
        this.eventSummary = eventSummary;
        return this;
    }
    public String getEventSummary() {
        return this.eventSummary;
    }

    public DescribeAiEngineEventResponseBody setEvidenceRequestCount(Long evidenceRequestCount) {
        this.evidenceRequestCount = evidenceRequestCount;
        return this;
    }
    public Long getEvidenceRequestCount() {
        return this.evidenceRequestCount;
    }

    public DescribeAiEngineEventResponseBody setFirstSeenAt(Long firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
        return this;
    }
    public Long getFirstSeenAt() {
        return this.firstSeenAt;
    }

    public DescribeAiEngineEventResponseBody setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public String getHandleStatus() {
        return this.handleStatus;
    }

    public DescribeAiEngineEventResponseBody setLastSeenAt(Long lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }
    public Long getLastSeenAt() {
        return this.lastSeenAt;
    }

    public DescribeAiEngineEventResponseBody setRelatedEventIds(String relatedEventIds) {
        this.relatedEventIds = relatedEventIds;
        return this;
    }
    public String getRelatedEventIds() {
        return this.relatedEventIds;
    }

    public DescribeAiEngineEventResponseBody setReportMarkdown(String reportMarkdown) {
        this.reportMarkdown = reportMarkdown;
        return this;
    }
    public String getReportMarkdown() {
        return this.reportMarkdown;
    }

    public DescribeAiEngineEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEventResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public DescribeAiEngineEventResponseBody setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public static class DescribeAiEngineEventResponseBodyAttackSourcesSources extends TeaModel {
        /**
         * <p>The display attribute of the source, such as the region code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN-510100</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The value of the attack source. If the attack source type is IP address (<strong>Type</strong> is set to <strong>ip</strong>), this parameter indicates the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.109</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAiEngineEventResponseBodyAttackSourcesSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventResponseBodyAttackSourcesSources self = new DescribeAiEngineEventResponseBodyAttackSourcesSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventResponseBodyAttackSourcesSources setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeAiEngineEventResponseBodyAttackSourcesSources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAiEngineEventResponseBodyAttackSources extends TeaModel {
        /**
         * <p>The list of sources of this type.</p>
         */
        @NameInMap("Sources")
        public java.util.List<DescribeAiEngineEventResponseBodyAttackSourcesSources> sources;

        /**
         * <p>The type of the attack source. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAiEngineEventResponseBodyAttackSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventResponseBodyAttackSources self = new DescribeAiEngineEventResponseBodyAttackSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventResponseBodyAttackSources setSources(java.util.List<DescribeAiEngineEventResponseBodyAttackSourcesSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<DescribeAiEngineEventResponseBodyAttackSourcesSources> getSources() {
            return this.sources;
        }

        public DescribeAiEngineEventResponseBodyAttackSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
