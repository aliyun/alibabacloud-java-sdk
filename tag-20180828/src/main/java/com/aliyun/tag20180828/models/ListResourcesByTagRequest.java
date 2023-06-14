// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListResourcesByTagRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListResourcesByTagRequestTagFilter tagFilter;

    /**
     * <p>The type of the query. Valid values:</p>
     * <br>
     * <p>*   EQUAL: exact match for resources to which the specified tag is added. This is the default value.</p>
     * <p>*   NOT: exact match for resources to which the specified tag is not added.</p>
     */
    @NameInMap("FuzzyType")
    public String fuzzyType;

    /**
     * <p>Specifies whether to return the information of tags added to the resources. Valid values:</p>
     * <br>
     * <p>*   False: does not return the information of tags added to the resources. This is the default value.</p>
     * <p>*   True: returns the information of all tags added to the resources.</p>
     */
    @NameInMap("IncludeAllTags")
    public Boolean includeAllTags;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 50. Maximum value: 1000.</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

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
     * <p>The region ID.</p>
     * <br>
     * <p>For more information about the region ID, see [Endpoints](~~170112~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource type. This parameter specifies a filter condition for the query.</p>
     * <br>
     * <p>*   If you set the FuzzyType parameter to EQUAL, you can set this parameter to a resource type provided in [Types of resources that support Tag API operations](~~172061~~).</p>
     * <p>*   If you set the FuzzyType parameter to NOT, you can set this parameter to a resource type provided in **Types of resources that support queries based on the NOT operator**.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourcesByTagRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByTagRequest self = new ListResourcesByTagRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesByTagRequest setTagFilter(ListResourcesByTagRequestTagFilter tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public ListResourcesByTagRequestTagFilter getTagFilter() {
        return this.tagFilter;
    }

    public ListResourcesByTagRequest setFuzzyType(String fuzzyType) {
        this.fuzzyType = fuzzyType;
        return this;
    }
    public String getFuzzyType() {
        return this.fuzzyType;
    }

    public ListResourcesByTagRequest setIncludeAllTags(Boolean includeAllTags) {
        this.includeAllTags = includeAllTags;
        return this;
    }
    public Boolean getIncludeAllTags() {
        return this.includeAllTags;
    }

    public ListResourcesByTagRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public ListResourcesByTagRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourcesByTagRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListResourcesByTagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListResourcesByTagRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListResourcesByTagRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListResourcesByTagRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public static class ListResourcesByTagRequestTagFilter extends TeaModel {
        /**
         * <p>The tag key. This parameter specifies a filter condition for the query.</p>
         * <br>
         * <p>The tag key can be a maximum of 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter specifies a filter condition for the query.</p>
         * <br>
         * <p>The tag value can be a maximum of 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourcesByTagRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByTagRequestTagFilter self = new ListResourcesByTagRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public ListResourcesByTagRequestTagFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourcesByTagRequestTagFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
