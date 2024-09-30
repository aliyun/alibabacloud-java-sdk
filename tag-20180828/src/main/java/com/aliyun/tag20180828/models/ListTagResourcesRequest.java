// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The type of the tag. Valid values:</p>
     * <ul>
     * <li>Custom</li>
     * <li>System</li>
     * <li>All</li>
     * </ul>
     * <p>Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("Category")
    public String category;

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
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 1000. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <ul>
     * <li>If the resources belong to a service that is centrally deployed, set the value to the region ID of the resources by referring to <a href="https://help.aliyun.com/document_detail/2579691.html">Regions supported by tag-related operations on resources of centrally deployed Alibaba Cloud services</a>.</li>
     * <li>If the resources belong to a service that is not centrally deployed, set the value to the region ID of the resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of a resource.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:acs:ecs:cn-hangzhou:123456789****:instance/i-bp15hr53jws84akg****</p>
     */
    @NameInMap("ResourceARN")
    public java.util.List<String> resourceARN;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The key-value pairs of tags. You can specify 1 to 10 key-value pairs.</p>
     * <p>If you specify multiple tags, the system queries the resources to which all these tags are added.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>A tag key must be 1 to 128 characters in length.</li>
     * <li>A tag value must be 1 to 128 characters in length.</li>
     * <li>Tag keys and tag values are case-sensitive.</li>
     * <li>Each tag key on a resource can have only one tag value. If you create a tag that has the same key as an existing tag, the value of the existing tag is overwritten.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTagResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceARN(java.util.List<String> resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }
    public java.util.List<String> getResourceARN() {
        return this.resourceARN;
    }

    public ListTagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTagResourcesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
