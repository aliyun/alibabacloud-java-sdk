// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktAdmintemplateRequest extends TeaModel {
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

    public static CreateLinkeLinktAdmintemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktAdmintemplateRequest self = new CreateLinkeLinktAdmintemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktAdmintemplateRequest setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent;
        return this;
    }
    public String getDefaultContent() {
        return this.defaultContent;
    }

    public CreateLinkeLinktAdmintemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktAdmintemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeLinktAdmintemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeLinktAdmintemplateRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktAdmintemplateRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public CreateLinkeLinktAdmintemplateRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public CreateLinkeLinktAdmintemplateRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
