// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktAdmintemplateRequest extends TeaModel {
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

    public static UpdateLinkeLinktAdmintemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktAdmintemplateRequest self = new UpdateLinkeLinktAdmintemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktAdmintemplateRequest setDefaultContent(String defaultContent) {
        this.defaultContent = defaultContent;
        return this;
    }
    public String getDefaultContent() {
        return this.defaultContent;
    }

    public UpdateLinkeLinktAdmintemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktAdmintemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeLinktAdmintemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeLinktAdmintemplateRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public UpdateLinkeLinktAdmintemplateRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public UpdateLinkeLinktAdmintemplateRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public UpdateLinkeLinktAdmintemplateRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
