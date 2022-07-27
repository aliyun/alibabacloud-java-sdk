// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateTemplateShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateShrinkRequest self = new CreateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTemplateShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
