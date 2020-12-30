// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ValidateConfigSettingRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("OptionSettings")
    public String optionSettings;

    public static ValidateConfigSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateConfigSettingRequest self = new ValidateConfigSettingRequest();
        return TeaModel.build(map, self);
    }

    public ValidateConfigSettingRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ValidateConfigSettingRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ValidateConfigSettingRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ValidateConfigSettingRequest setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }
    public String getOptionSettings() {
        return this.optionSettings;
    }

}
