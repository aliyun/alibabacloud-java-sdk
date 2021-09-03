// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateRequest extends TeaModel {
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ValidationOption")
    public String validationOption;

    public static ValidateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateRequest self = new ValidateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public ValidateTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidateTemplateRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public ValidateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValidateTemplateRequest setValidationOption(String validationOption) {
        this.validationOption = validationOption;
        return this;
    }
    public String getValidationOption() {
        return this.validationOption;
    }

}
