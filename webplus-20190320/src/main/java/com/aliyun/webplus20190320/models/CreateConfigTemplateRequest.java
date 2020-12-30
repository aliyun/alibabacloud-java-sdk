// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateRequest extends TeaModel {
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateDescription")
    public String templateDescription;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("SourceTemplateId")
    public String sourceTemplateId;

    @NameInMap("SourceEnvId")
    public String sourceEnvId;

    @NameInMap("ProfileName")
    public String profileName;

    @NameInMap("PkgVersionId")
    public String pkgVersionId;

    @NameInMap("OptionSettings")
    public String optionSettings;

    public static CreateConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateRequest self = new CreateConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateConfigTemplateRequest setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public CreateConfigTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateConfigTemplateRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateConfigTemplateRequest setSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
        return this;
    }
    public String getSourceTemplateId() {
        return this.sourceTemplateId;
    }

    public CreateConfigTemplateRequest setSourceEnvId(String sourceEnvId) {
        this.sourceEnvId = sourceEnvId;
        return this;
    }
    public String getSourceEnvId() {
        return this.sourceEnvId;
    }

    public CreateConfigTemplateRequest setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }
    public String getProfileName() {
        return this.profileName;
    }

    public CreateConfigTemplateRequest setPkgVersionId(String pkgVersionId) {
        this.pkgVersionId = pkgVersionId;
        return this;
    }
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    public CreateConfigTemplateRequest setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }
    public String getOptionSettings() {
        return this.optionSettings;
    }

}
