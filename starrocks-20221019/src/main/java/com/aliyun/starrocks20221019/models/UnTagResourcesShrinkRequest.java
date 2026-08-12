// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UnTagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags from the resources. This parameter is valid only when the TagKey parameter is left empty. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A list of resource IDs. The list can contain up to 50 resource IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public String resourceIdShrink;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tag keys to remove. The list can contain up to 20 tag keys.</p>
     */
    @NameInMap("TagKey")
    public String tagKeyShrink;

    public static UnTagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesShrinkRequest self = new UnTagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnTagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UnTagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnTagResourcesShrinkRequest setResourceIdShrink(String resourceIdShrink) {
        this.resourceIdShrink = resourceIdShrink;
        return this;
    }
    public String getResourceIdShrink() {
        return this.resourceIdShrink;
    }

    public UnTagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UnTagResourcesShrinkRequest setTagKeyShrink(String tagKeyShrink) {
        this.tagKeyShrink = tagKeyShrink;
        return this;
    }
    public String getTagKeyShrink() {
        return this.tagKeyShrink;
    }

}
