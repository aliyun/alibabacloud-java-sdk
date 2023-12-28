// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ValidatePublicTemplateContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Type")
    public String type;

    public static ValidatePublicTemplateContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidatePublicTemplateContentRequest self = new ValidatePublicTemplateContentRequest();
        return TeaModel.build(map, self);
    }

    public ValidatePublicTemplateContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ValidatePublicTemplateContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidatePublicTemplateContentRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ValidatePublicTemplateContentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
