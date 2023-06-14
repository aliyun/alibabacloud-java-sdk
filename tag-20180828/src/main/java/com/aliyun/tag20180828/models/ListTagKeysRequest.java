// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagKeysRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListTagKeysRequestTagFilter tagFilter;

    /**
     * <p>The type of the resource tags. This parameter specifies a filter condition for the query. Valid values:</p>
     * <br>
     * <p>*   all (default value)</p>
     * <p>*   custom</p>
     * <p>*   system</p>
     * <br>
     * <p>>  The value of this parameter is not case-sensitive.</p>
     */
    @NameInMap("Category")
    public String category;

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
     * <p>The token that is used to start the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of tag keys to return on each page.</p>
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

    public static ListTagKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysRequest self = new ListTagKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListTagKeysRequest setTagFilter(ListTagKeysRequestTagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public ListTagKeysRequestTagFilter getTagFilter() {
        return this.tagFilter;
    }

    public ListTagKeysRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListTagKeysRequest setFuzzyType(String fuzzyType) {
        this.fuzzyType = fuzzyType;
        return this;
    }
    public String getFuzzyType() {
        return this.fuzzyType;
    }

    public ListTagKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagKeysRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTagKeysRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTagKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagKeysRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListTagKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagKeysRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagKeysRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class ListTagKeysRequestTagFilter extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>This parameter is used together with the `FuzzyType` parameter.</p>
         * <br>
         * <p>>  This parameter is available only in the China (Shenzhen) and China (Hong Kong) regions.</p>
         */
        @NameInMap("Key")
        public String key;

        public static ListTagKeysRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTagKeysRequestTagFilter self = new ListTagKeysRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public ListTagKeysRequestTagFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
