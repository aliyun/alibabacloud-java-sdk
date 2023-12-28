// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdatePublicTemplateRequest extends TeaModel {
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

    public static UpdatePublicTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicTemplateRequest self = new UpdatePublicTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePublicTemplateRequest setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public UpdatePublicTemplateRequest setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }
    public String getPublisher() {
        return this.publisher;
    }

    public UpdatePublicTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePublicTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
