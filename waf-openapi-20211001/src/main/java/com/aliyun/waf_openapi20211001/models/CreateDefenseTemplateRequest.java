// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateRequest extends TeaModel {
    @NameInMap("DefenseScene")
    public String defenseScene;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateOrigin")
    public String templateOrigin;

    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    @NameInMap("TemplateType")
    public String templateType;

    public static CreateDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseTemplateRequest self = new CreateDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseTemplateRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDefenseTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateDefenseTemplateRequest setTemplateOrigin(String templateOrigin) {
        this.templateOrigin = templateOrigin;
        return this;
    }
    public String getTemplateOrigin() {
        return this.templateOrigin;
    }

    public CreateDefenseTemplateRequest setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public CreateDefenseTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
