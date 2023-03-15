// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the template resides. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.</p>
     * <br>
     * <p>If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>You can specify only one of the TemplateBody and TemplateURL parameters.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <br>
     * <p>>  If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>You can specify only one of the TemplateBody and TemplateURL parameters.</p>
     * <br>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>Specifies whether to enable additional validation for the template. Default value: None. Valid values:</p>
     * <br>
     * <p>*   None: does not enable additional validation.</p>
     * <br>
     * <p>*   EnableTerraformValidation: runs the `terraform validate` command in the Terraform CLI to enable additional validation for a Terraform template.</p>
     * <br>
     * <p>*   EnableFastTerraformValidation: runs a command that is similar to the `terraform validate` command in the Terraform CLI to enable additional validation for a Terraform template.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** Compared with the EnableTerraformValidation method, the EnableFastTerraformValidation method validates a template at a faster speed, but lower integrity level.</p>
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

    public ValidateTemplateRequest setValidationOption(String validationOption) {
        this.validationOption = validationOption;
        return this;
    }
    public String getValidationOption() {
        return this.validationOption;
    }

}
