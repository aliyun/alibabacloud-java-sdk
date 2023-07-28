// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The content of the template. The content must be in the JSON or YAML format, and its maximum size is 64 KB.</p>
     */
    @NameInMap("Content")
    public String content;

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
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the template. The name can be up to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (\_). The name cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The name of the template version.</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateShrinkRequest self = new UpdateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTemplateShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public UpdateTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
