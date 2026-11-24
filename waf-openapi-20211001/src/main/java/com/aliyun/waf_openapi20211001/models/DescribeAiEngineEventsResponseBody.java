// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventsResponseBody extends TeaModel {
    /**
     * <p>The list of events.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAiEngineEventsResponseBodyItems> items;

    /**
     * <p>The number of entries to return per page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. If a next page exists, this field returns a value.</p>
     * <blockquote>
     * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>token-demo</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>request-demo</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of events that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAiEngineEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventsResponseBody self = new DescribeAiEngineEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventsResponseBody setItems(java.util.List<DescribeAiEngineEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAiEngineEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAiEngineEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiEngineEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources extends TeaModel {
        /**
         * <p>The display attribute of the attack source, such as the region code.</p>
         * 
         * <strong>example:</strong>
         * <p>CN-510100</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The value of the attack source. If the attack source type is IP address (the <strong>Type</strong> parameter is set to <strong>ip</strong>), the value is an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.109</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources self = new DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAiEngineEventsResponseBodyItemsAttackSources extends TeaModel {
        /**
         * <p>The list of attack sources of the specified type.</p>
         */
        @NameInMap("Sources")
        public java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources> sources;

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

        public static DescribeAiEngineEventsResponseBodyItemsAttackSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventsResponseBodyItemsAttackSources self = new DescribeAiEngineEventsResponseBodyItemsAttackSources();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventsResponseBodyItemsAttackSources setSources(java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSourcesSources> getSources() {
            return this.sources;
        }

        public DescribeAiEngineEventsResponseBodyItemsAttackSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAiEngineEventsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of attack source groups for the event.</p>
         */
        @NameInMap("AttackSources")
        public java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSources> attackSources;

        /**
         * <p>The statistics of suspected bypass evidence requests for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BypassRequestCount")
        public Long bypassRequestCount;

        /**
         * <p>The list of domain names involved in the event.</p>
         */
        @NameInMap("Domains")
        public java.util.List<String> domains;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>EVT-20261025-109</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The name of the event in the selected language.</p>
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
         * <p>The statistics of evidence requests for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("EvidenceRequestCount")
        public Long evidenceRequestCount;

        /**
         * <p>The time when the event was first detected. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
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
         * <li><p><strong>handling</strong>: In progress.</p>
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
         * <p>The time when the event was last detected. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
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
         * <p>The list of protected objects involved in the event.</p>
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

        public static DescribeAiEngineEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventsResponseBodyItems self = new DescribeAiEngineEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventsResponseBodyItems setAttackSources(java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSources> attackSources) {
            this.attackSources = attackSources;
            return this;
        }
        public java.util.List<DescribeAiEngineEventsResponseBodyItemsAttackSources> getAttackSources() {
            return this.attackSources;
        }

        public DescribeAiEngineEventsResponseBodyItems setBypassRequestCount(Long bypassRequestCount) {
            this.bypassRequestCount = bypassRequestCount;
            return this;
        }
        public Long getBypassRequestCount() {
            return this.bypassRequestCount;
        }

        public DescribeAiEngineEventsResponseBodyItems setDomains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        public DescribeAiEngineEventsResponseBodyItems setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeAiEngineEventsResponseBodyItems setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAiEngineEventsResponseBodyItems setEventNodeCount(Integer eventNodeCount) {
            this.eventNodeCount = eventNodeCount;
            return this;
        }
        public Integer getEventNodeCount() {
            return this.eventNodeCount;
        }

        public DescribeAiEngineEventsResponseBodyItems setEvidenceRequestCount(Long evidenceRequestCount) {
            this.evidenceRequestCount = evidenceRequestCount;
            return this;
        }
        public Long getEvidenceRequestCount() {
            return this.evidenceRequestCount;
        }

        public DescribeAiEngineEventsResponseBodyItems setFirstSeenAt(Long firstSeenAt) {
            this.firstSeenAt = firstSeenAt;
            return this;
        }
        public Long getFirstSeenAt() {
            return this.firstSeenAt;
        }

        public DescribeAiEngineEventsResponseBodyItems setHandleStatus(String handleStatus) {
            this.handleStatus = handleStatus;
            return this;
        }
        public String getHandleStatus() {
            return this.handleStatus;
        }

        public DescribeAiEngineEventsResponseBodyItems setLastSeenAt(Long lastSeenAt) {
            this.lastSeenAt = lastSeenAt;
            return this;
        }
        public Long getLastSeenAt() {
            return this.lastSeenAt;
        }

        public DescribeAiEngineEventsResponseBodyItems setRelatedEventIds(String relatedEventIds) {
            this.relatedEventIds = relatedEventIds;
            return this;
        }
        public String getRelatedEventIds() {
            return this.relatedEventIds;
        }

        public DescribeAiEngineEventsResponseBodyItems setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public DescribeAiEngineEventsResponseBodyItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

}
