// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Content")
    public String content;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTemplateRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateTemplateRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
