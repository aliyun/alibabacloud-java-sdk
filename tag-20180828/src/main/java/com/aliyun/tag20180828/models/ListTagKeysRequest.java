// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagKeysRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListTagKeysRequestTagFilter tagFilter;

    /**
     * <p>The type of the resource tags. This parameter specifies a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>all (default value)</li>
     * <li>custom</li>
     * <li>system</li>
     * </ul>
     * <blockquote>
     * <p> The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The type of the query. Valid values:</p>
     * <ul>
     * <li>EQUAL (default): exact match</li>
     * <li>PREFIX: prefix-based fuzzy match</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EQUAL</p>
     */
    @NameInMap("FuzzyType")
    public String fuzzyType;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of tag keys to return on each page.</p>
     * <p>Maximum value: 1000. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The category of the tags. This parameter specifies a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>ResourceTag: resource tags, including custom and system tags. This is the default value.</li>
     * <li>MetaTag: preset tags.</li>
     * </ul>
     * <blockquote>
     * <p> The value of this parameter is not case-sensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ResourceTag</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID.</p>
     * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/2330902.html">Endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource type. This parameter specifies a filter condition for the query.</p>
     * <p>Format: <code>ALIYUN::${ProductCode}::${ResourceType}</code>. All letters in the value of this parameter must be in uppercase.</p>
     * <ul>
     * <li><code>ProductCode</code>: the service code. You can set this field to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
     * <li><code>ResourceType</code>: the resource type. You can set this field to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::ECS::INSTANCE</p>
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
         * <p>The tag key for a fuzzy query.</p>
         * <p>This parameter is used together with the <code>FuzzyType</code> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
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
