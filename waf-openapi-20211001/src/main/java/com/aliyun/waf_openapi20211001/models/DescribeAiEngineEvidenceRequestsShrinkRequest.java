// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestsShrinkRequest extends TeaModel {
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
    public String filterShrink;

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

    public static DescribeAiEngineEvidenceRequestsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestsShrinkRequest self = new DescribeAiEngineEvidenceRequestsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setSeachValue(String seachValue) {
        this.seachValue = seachValue;
        return this;
    }
    public String getSeachValue() {
        return this.seachValue;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeAiEngineEvidenceRequestsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
