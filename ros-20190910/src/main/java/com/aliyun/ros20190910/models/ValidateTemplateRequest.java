// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateRequest extends TeaModel {
    /**
     * <p>The regular resource types.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the output item.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The name of the output item.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("UpdateInfoOptions")
    public java.util.List<String> updateInfoOptions;

    /**
     * <p>The DataSource resource types.</p>
     */
    @NameInMap("ValidationOption")
    public String validationOption;

    public static ValidateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateRequest self = new ValidateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public ValidateTemplateRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public ValidateTemplateRequest setUpdateInfoOptions(java.util.List<String> updateInfoOptions) {
        this.updateInfoOptions = updateInfoOptions;
        return this;
    }
    public java.util.List<String> getUpdateInfoOptions() {
        return this.updateInfoOptions;
    }

    public ValidateTemplateRequest setValidationOption(String validationOption) {
        this.validationOption = validationOption;
        return this;
    }
    public String getValidationOption() {
        return this.validationOption;
    }

}
