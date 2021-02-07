// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateAppEnvRequest extends TeaModel {
    @NameInMap("EnvName")
    public String envName;

    @NameInMap("EnvDescription")
    public String envDescription;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PkgVersionId")
    public String pkgVersionId;

    @NameInMap("OptionSettings")
    public String optionSettings;

    @NameInMap("ProfileName")
    public String profileName;

    @NameInMap("SourceEnvId")
    public String sourceEnvId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ExtraProperties")
    public String extraProperties;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppEnvRequest self = new CreateAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppEnvRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public CreateAppEnvRequest setEnvDescription(String envDescription) {
        this.envDescription = envDescription;
        return this;
    }
    public String getEnvDescription() {
        return this.envDescription;
    }

    public CreateAppEnvRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateAppEnvRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAppEnvRequest setPkgVersionId(String pkgVersionId) {
        this.pkgVersionId = pkgVersionId;
        return this;
    }
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    public CreateAppEnvRequest setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }
    public String getOptionSettings() {
        return this.optionSettings;
    }

    public CreateAppEnvRequest setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }
    public String getProfileName() {
        return this.profileName;
    }

    public CreateAppEnvRequest setSourceEnvId(String sourceEnvId) {
        this.sourceEnvId = sourceEnvId;
        return this;
    }
    public String getSourceEnvId() {
        return this.sourceEnvId;
    }

    public CreateAppEnvRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateAppEnvRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAppEnvRequest setExtraProperties(String extraProperties) {
        this.extraProperties = extraProperties;
        return this;
    }
    public String getExtraProperties() {
        return this.extraProperties;
    }

    public CreateAppEnvRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
