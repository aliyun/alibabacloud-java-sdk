// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <ul>
     * <li>If the resources belong to a service that is centrally deployed, set the value to <code>cn-hangzhou</code> or to the region ID of the resources by referring to <a href="https://help.aliyun.com/document_detail/2579691.html">Regions supported by tag-related operations on resources of centrally deployed Alibaba Cloud services</a>.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:acs:vpc:cn-hangzhou:123456789****:vpc/vpc-bp19dd90tkt6tz7wu****</p>
     */
    @NameInMap("ResourceARN")
    public java.util.List<String> resourceARN;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The key-value pairs of tags. You can specify 1 to 10 key-value pairs.</p>
     * <p>If you specify multiple tags, the system adds all the tags to the specified resources.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>A tag key must be 1 to 128 characters in length.</li>
     * <li>A tag value must be 1 to 128 characters in length.</li>
     * <li>Tag keys and tag values are case-sensitive.</li>
     * <li>Each tag key on a resource can have only one tag value. If you create a tag that has the same key as an existing tag, the value of the existing tag is overwritten.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceARN(java.util.List<String> resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }
    public java.util.List<String> getResourceARN() {
        return this.resourceARN;
    }

    public TagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
