// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateConfigTemplateRequest extends TeaModel {
    @NameInMap("TemplateDescription")
    public String templateDescription;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("OptionSettings")
    public String optionSettings;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigTemplateRequest self = new UpdateConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigTemplateRequest setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public UpdateConfigTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateConfigTemplateRequest setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }
    public String getOptionSettings() {
        return this.optionSettings;
    }

    public UpdateConfigTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
