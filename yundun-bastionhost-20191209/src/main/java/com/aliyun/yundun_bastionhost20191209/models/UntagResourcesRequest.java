// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete all tags that are added to the bastion host.</p>
     * <br>
     * <p>*   If you specify TagKey.N, the value of this parameter can only be **false**, which indicates that only a specified tag is deleted.</p>
     * <p>*   If you do not specify TagKey.N and the value of this parameter is **true**, all tags are deleted. If you do not specify TagKey.N and the value of this parameter is **false**, no tags are deleted.</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID of the bastion host to query.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>An array that consists of IDs of bastion hosts.</p>
     * <br>
     * <p>Valid values: 1 to 20.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>Set the value to **INSTANCE**, which indicates that the resource is a bastion host.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of tag N.</p>
     * <br>
     * <p>Valid values of N: 1 to 20.</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
