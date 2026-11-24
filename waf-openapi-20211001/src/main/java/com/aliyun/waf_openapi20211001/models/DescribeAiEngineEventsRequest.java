// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventsRequest extends TeaModel {
    /**
     * <p>The end time. The time is a UNIX timestamp in UTC. Unit: seconds. The data is filtered based on the time when the event was last detected. The end time must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1793059200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions. Exact match is used, and multiple conditions are connected by the AND logical operator.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;riskLevel&quot;:&quot;high&quot;,&quot;resource&quot;:&quot;resource-api-example&quot;}</p>
     */
    @NameInMap("Filter")
    public DescribeAiEngineEventsRequestFilter filter;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_dddsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. The value is the <strong>NextToken</strong> parameter value returned by the previous API call. You do not need to specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the WAF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-****mo</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The search value. This parameter is used together with SearchKey. Maximum length: 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>testKey</p>
     */
    @NameInMap("SeachValue")
    public String seachValue;

    /**
     * <p>The search field. This parameter is used together with SeachValue.</p>
     * 
     * <strong>example:</strong>
     * <p>eventName</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>last_seen</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time. The time is a UNIX timestamp in UTC. Unit: seconds. The data is filtered based on the time when the event was last detected. You can query data within the last 30 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1792972800</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAiEngineEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventsRequest self = new DescribeAiEngineEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAiEngineEventsRequest setFilter(DescribeAiEngineEventsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeAiEngineEventsRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeAiEngineEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAiEngineEventsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAiEngineEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAiEngineEventsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeAiEngineEventsRequest setSeachValue(String seachValue) {
        this.seachValue = seachValue;
        return this;
    }
    public String getSeachValue() {
        return this.seachValue;
    }

    public DescribeAiEngineEventsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAiEngineEventsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeAiEngineEventsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeAiEngineEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeAiEngineEventsRequestFilter extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.example.com</p>
         */
        @NameInMap("domain")
        public String domain;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EVT-20261025109</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The number of nodes included in the event.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("eventNodeCount")
        public Integer eventNodeCount;

        /**
         * <p>The event handling status.</p>
         * 
         * <strong>example:</strong>
         * <p>unhandled</p>
         */
        @NameInMap("handleStatus")
        public String handleStatus;

        /**
         * <p>The protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>resource-api-example</p>
         */
        @NameInMap("resource")
        public String resource;

        /**
         * <p>The risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        /**
         * <p>The source account of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>account-demo-***</p>
         */
        @NameInMap("sourceAccount")
        public String sourceAccount;

        /**
         * <p>The source fingerprint of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>fingerprint-demo-***</p>
         */
        @NameInMap("sourceFingerprint")
        public String sourceFingerprint;

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.109</p>
         */
        @NameInMap("sourceIp")
        public String sourceIp;

        public static DescribeAiEngineEventsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventsRequestFilter self = new DescribeAiEngineEventsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventsRequestFilter setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeAiEngineEventsRequestFilter setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeAiEngineEventsRequestFilter setEventNodeCount(Integer eventNodeCount) {
            this.eventNodeCount = eventNodeCount;
            return this;
        }
        public Integer getEventNodeCount() {
            return this.eventNodeCount;
        }

        public DescribeAiEngineEventsRequestFilter setHandleStatus(String handleStatus) {
            this.handleStatus = handleStatus;
            return this;
        }
        public String getHandleStatus() {
            return this.handleStatus;
        }

        public DescribeAiEngineEventsRequestFilter setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public DescribeAiEngineEventsRequestFilter setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeAiEngineEventsRequestFilter setSourceAccount(String sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }
        public String getSourceAccount() {
            return this.sourceAccount;
        }

        public DescribeAiEngineEventsRequestFilter setSourceFingerprint(String sourceFingerprint) {
            this.sourceFingerprint = sourceFingerprint;
            return this;
        }
        public String getSourceFingerprint() {
            return this.sourceFingerprint;
        }

        public DescribeAiEngineEventsRequestFilter setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

    }

}
