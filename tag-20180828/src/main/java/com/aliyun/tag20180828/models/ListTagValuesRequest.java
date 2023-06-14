// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagValuesRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListTagValuesRequestTagFilter tagFilter;

    /**
     * <p>The type of the query. Valid values:</p>
     * <br>
     * <p>*   EQUAL: exact match. This is the default value.</p>
     * <p>*   PREFIX: prefix-based fuzzy match.</p>
     * <br>
     * <p>>  This parameter is available only in the China (Shenzhen) and China (Hong Kong) regions.</p>
     */
    @NameInMap("FuzzyType")
    public String fuzzyType;

    /**
     * <p>The tag key. This parameter specifies a filter condition for the query.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The token that is used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of tag values to return on each page.</p>
     * <br>
     * <p>Maximum value: 1000. Default value: 50.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The category of the tags. This parameter specifies a filter condition for the query. Valid values:</p>
     * <br>
     * <p>*   ResourceTag: resource tags, including custom and system tags. This is the default value.</p>
     * <p>*   MetaTag: preset tags.</p>
     * <br>
     * <p>>  The value of this parameter is not case-sensitive.</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>For more information about the region ID, see [Endpoints](~~170112~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The type of the resources. This parameter specifies a filter condition for the query.</p>
     * <br>
     * <p>For more information about supported resource types, see [Types of resources that support Tag API operations](~~172061~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesRequest self = new ListTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagValuesRequest setTagFilter(ListTagValuesRequestTagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public ListTagValuesRequestTagFilter getTagFilter() {
        return this.tagFilter;
    }

    public ListTagValuesRequest setFuzzyType(String fuzzyType) {
        this.fuzzyType = fuzzyType;
        return this;
    }
    public String getFuzzyType() {
        return this.fuzzyType;
    }

    public ListTagValuesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListTagValuesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagValuesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTagValuesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTagValuesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagValuesRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListTagValuesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagValuesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class ListTagValuesRequestTagFilter extends TeaModel {
        /**
         * <p>The tag value.</p>
         * <br>
         * <p>This parameter is used together with the `FuzzyType` parameter.</p>
         * <br>
         * <p>>  This parameter is available only in the China (Shenzhen) and China (Hong Kong) regions.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagValuesRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTagValuesRequestTagFilter self = new ListTagValuesRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public ListTagValuesRequestTagFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
