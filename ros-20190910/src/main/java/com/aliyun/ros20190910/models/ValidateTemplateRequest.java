// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates the value, which must be unique.</p>
     * <p>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID of the stack template. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent list of Alibaba Cloud regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The structure of the template body. The template body can be 1 to 524,288 bytes in length.<br>If the template body is long, use a POST request and place the parameter in the request body. This prevents a request failure caused by an excessively long URL.<br>You can specify either TemplateBody or TemplateURL, but not both.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The location of the file that contains the template body. The URL must point to a template that is located on an HTTP web server or in an Alibaba Cloud OSS bucket, such as oss\://ros/template/demo or oss\://ros/template/demo?RegionId=cn-hangzhou. The template can be up to 524,288 bytes in size.</p>
     * <blockquote>
     * <p>If you do not specify the region of the OSS bucket, the value of the RegionId parameter is used.</p>
     * </blockquote>
     * <p>You can specify either TemplateBody or TemplateURL, but not both.<br>The URL can be up to 1,024 bytes in length.<br></p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The list of options for the update information. The list can contain up to two options.</p>
     */
    @NameInMap("UpdateInfoOptions")
    public java.util.List<String> updateInfoOptions;

    /**
     * <p>Specifies whether to enable additional validation for the template. Valid values:</p>
     * <ul>
     * <li><p>None (default): No additional validation is enabled.</p>
     * </li>
     * <li><p>EnableTerraformValidation: For a Terraform template, the <code>terraform validate</code> command of the Terraform command-line interface (CLI) is used to enable additional validation.</p>
     * </li>
     * <li><p>EnableFastTerraformValidation: For a Terraform template, a command that is similar to the <code>terraform validate</code> command of the Terraform CLI is used to enable additional validation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Compared with EnableTerraformValidation, EnableFastTerraformValidation is faster but less comprehensive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
