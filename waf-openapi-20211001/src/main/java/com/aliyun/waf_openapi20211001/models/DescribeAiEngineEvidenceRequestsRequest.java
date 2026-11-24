// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestsRequest extends TeaModel {
    /**
     * <p>The event ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EVT-20241025-109</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The filter conditions. Exact match is used, and multiple conditions are connected by the AND logical operator.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;suspectedBypass&quot;:&quot;1&quot;,&quot;httpStatus&quot;:&quot;500&quot;}</p>
     */
    @NameInMap("Filter")
    public DescribeAiEngineEvidenceRequestsRequestFilter filter;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-de****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The response language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The number of entries to return per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. The value is the <strong>NextToken</strong> parameter value returned by the previous API call. You do not need to specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the WAF instance resides.</p>
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
     * <p>rg-dsdo*****</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The search value. This parameter is used together with SearchKey. The value can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-20241***ssdas</p>
     */
    @NameInMap("SeachValue")
    public String seachValue;

    /**
     * <p>The search key. This parameter is used together with SeachValue.</p>
     * 
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>request_time</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static DescribeAiEngineEvidenceRequestsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestsRequest self = new DescribeAiEngineEvidenceRequestsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeAiEngineEvidenceRequestsRequest setFilter(DescribeAiEngineEvidenceRequestsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public DescribeAiEngineEvidenceRequestsRequestFilter getFilter() {
        return this.filter;
    }

    public DescribeAiEngineEvidenceRequestsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAiEngineEvidenceRequestsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAiEngineEvidenceRequestsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEvidenceRequestsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEvidenceRequestsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAiEngineEvidenceRequestsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeAiEngineEvidenceRequestsRequest setSeachValue(String seachValue) {
        this.seachValue = seachValue;
        return this;
    }
    public String getSeachValue() {
        return this.seachValue;
    }

    public DescribeAiEngineEvidenceRequestsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAiEngineEvidenceRequestsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeAiEngineEvidenceRequestsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class DescribeAiEngineEvidenceRequestsRequestFilter extends TeaModel {
        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("httpStatus")
        public String httpStatus;

        /**
         * <p>The evidence impact tag.</p>
         * 
         * <strong>example:</strong>
         * <p>bypass</p>
         */
        @NameInMap("impactType")
        public String impactType;

        /**
         * <p>The HTTP request method. Exact match is used.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The node ID. Exact match is used. The value can be up to 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>n109-04</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The attack source type.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>Specifies whether the request is a suspected bypass.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("suspectedBypass")
        public String suspectedBypass;

        public static DescribeAiEngineEvidenceRequestsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEvidenceRequestsRequestFilter self = new DescribeAiEngineEvidenceRequestsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public String getHttpStatus() {
            return this.httpStatus;
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setImpactType(String impactType) {
            this.impactType = impactType;
            return this;
        }
        public String getImpactType() {
            return this.impactType;
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeAiEngineEvidenceRequestsRequestFilter setSuspectedBypass(String suspectedBypass) {
            this.suspectedBypass = suspectedBypass;
            return this;
        }
        public String getSuspectedBypass() {
            return this.suspectedBypass;
        }

    }

}
