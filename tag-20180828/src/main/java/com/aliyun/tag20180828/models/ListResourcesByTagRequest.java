// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListResourcesByTagRequest extends TeaModel {
    @NameInMap("TagFilter")
    public ListResourcesByTagRequestTagFilter tagFilter;

    /**
     * <p>The type of the query. Valid values:</p>
     * <ul>
     * <li>EQUAL: exact match for resources to which the specified tag is added. This is the default value.</li>
     * <li>NOT: exact match for resources to which the specified tag is not added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EQUAL</p>
     */
    @NameInMap("FuzzyType")
    public String fuzzyType;

    /**
     * <p>Specifies whether to return the information of tags added to the resources. Valid values:</p>
     * <ul>
     * <li>False: does not return the information of tags added to the resources. This is the default value.</li>
     * <li>True: returns the information of all tags added to the resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IncludeAllTags")
    public Boolean includeAllTags;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 50. Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResult")
    public Integer maxResult;

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
     * <p>The region ID.</p>
     * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/2330902.html">Endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The resource type. This parameter specifies a filter condition for the query.</p>
     * <ul>
     * <li>If you set the FuzzyType parameter to EQUAL, you can set this parameter to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
     * <li>If you set the FuzzyType parameter to NOT, you can set this parameter to a resource type provided in <strong>Types of resources that support queries based on the NOT operator</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::VPC::VPC</p>
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
         * <p>The tag key can be a maximum of 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code> and cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter specifies a filter condition for the query.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
