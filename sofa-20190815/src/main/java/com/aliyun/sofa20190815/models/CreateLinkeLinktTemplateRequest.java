// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktTemplateRequest extends TeaModel {
    @NameInMap("DefaultContent")
    public String defaultContent;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("TemplateLabel")
    public String templateLabel;

    @NameInMap("Type")
    public Long type;

    public static CreateLinkeLinktTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktTemplateRequest self = new CreateLinkeLinktTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktTemplateRequest setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent;
        return this;
    }
    public String getDefaultContent() {
        return this.defaultContent;
    }

    public CreateLinkeLinktTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktTemplateRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktTemplateRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public CreateLinkeLinktTemplateRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public CreateLinkeLinktTemplateRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
