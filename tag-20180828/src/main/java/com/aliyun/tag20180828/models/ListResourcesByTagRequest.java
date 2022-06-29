// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListResourcesByTagRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListResourcesByTagRequestTagFilter tagFilter;

    @NameInMap("FuzzyType")
    public String fuzzyType;

    @NameInMap("IncludeAllTags")
    public Boolean includeAllTags;

    @NameInMap("MaxResult")
    public Integer maxResult;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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
        @NameInMap("Key")
        public String key;

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
