// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreatePublicTemplateRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Content")
    public String content;

    @NameInMap("Popularity")
    public Integer popularity;

    @NameInMap("Publisher")
    public String publisher;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreatePublicTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicTemplateRequest self = new CreatePublicTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublicTemplateRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreatePublicTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreatePublicTemplateRequest setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public CreatePublicTemplateRequest setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
    public String getPublisher() {
        return this.publisher;
    }

    public CreatePublicTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePublicTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
