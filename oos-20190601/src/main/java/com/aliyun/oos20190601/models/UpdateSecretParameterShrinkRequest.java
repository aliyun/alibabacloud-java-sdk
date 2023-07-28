// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateSecretParameterShrinkRequest extends TeaModel {
    /**
     * <p>The description of the parameter. The description must be 1 to 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the parameter. The name must be 1 to 180 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the parameter.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The value of the parameter. The value must be 1 to 4096 characters in length.</p>
     */
    @NameInMap("Value")
    public String value;

    public static UpdateSecretParameterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretParameterShrinkRequest self = new UpdateSecretParameterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSecretParameterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSecretParameterShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSecretParameterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSecretParameterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateSecretParameterShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateSecretParameterShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
