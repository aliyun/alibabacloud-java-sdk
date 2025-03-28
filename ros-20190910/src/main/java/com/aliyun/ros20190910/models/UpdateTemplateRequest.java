// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the template. The maximum length is 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>It is a demo.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether to update the Draft (draft) version. Values:</p>
     * <ul>
     * <li>false (default): If template content is provided, a new version is created, and the Draft version is cleared. Otherwise, the current latest version is modified.</li>
     * <li>true: Modifies the Draft version. The Draft version can only be retrieved via the GetTemplate interface. The ListTemplateVersions interface will not return it. The TemplateVersion parameter in other interfaces cannot specify Draft.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDraft")
    public Boolean isDraft;

    /**
     * <p>Template version rotation strategy. Values:</p>
     * <ul>
     * <li>None (default): No rotation. An error occurs when the version limit is reached.</li>
     * <li>DeleteOldestNonSharedVersionWhenLimitExceeded: Rotates and deletes non-shared template versions.<blockquote>
     * <ul>
     * <li>If all versions of the template are shared, they cannot be rotated and deleted.</li>
     * <li>The current latest version will not be rotated and deleted.</li>
     * <li>Regardless of whether rotation deletion is used, the template version number cannot exceed v65000.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("RotateStrategy")
    public String rotateStrategy;

    /**
     * <p>The structure of the template body. The length should be between 1 and 524,288 bytes. If the content is long, it is recommended to use HTTP POST + Body Param to pass the parameter in the request body to avoid request failure due to an overly long URL.</p>
     * <blockquote>
     * <p>You must and can only specify one of <code>TemplateBody</code>, <code>TemplateURL</code>, <code>TemplateId</code>, or <code>TemplateScratchId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The template ID. Supports both shared and private templates.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.<br>The length should not exceed 255 characters (utf-8 encoding), and it must start with a number, letter, or Chinese character. It can include numbers, letters, Chinese characters, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The location of the file containing the template body. The URL must point to a template located on a web server (HTTP or HTTPS) or in an Alibaba Cloud OSS bucket (e.g., oss://ros/template/demo, oss://ros/template/demo?RegionId=cn-hangzhou), with a maximum size of 524,288 bytes.   </p>
     * <blockquote>
     * <p>If the OSS region is not specified, it defaults to the same as the <code>RegionId</code> parameter in the request.</p>
     * </blockquote>
     * <p>You can only specify one of <code>TemplateBody</code> or <code>TemplateURL</code>.<br>The maximum length of the URL is 1,024 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>Validation options.</p>
     * <p>By default, no options are enabled, and strict validation is performed.</p>
     */
    @NameInMap("ValidationOptions")
    public java.util.List<String> validationOptions;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
        return this;
    }
    public Boolean getIsDraft() {
        return this.isDraft;
    }

    public UpdateTemplateRequest setRotateStrategy(String rotateStrategy) {
        this.rotateStrategy = rotateStrategy;
        return this;
    }
    public String getRotateStrategy() {
        return this.rotateStrategy;
    }

    public UpdateTemplateRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public UpdateTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public UpdateTemplateRequest setValidationOptions(java.util.List<String> validationOptions) {
        this.validationOptions = validationOptions;
        return this;
    }
    public java.util.List<String> getValidationOptions() {
        return this.validationOptions;
    }

}
