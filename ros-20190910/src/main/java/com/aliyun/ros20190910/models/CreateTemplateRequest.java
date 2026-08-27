// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the template. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>It is a demo.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource group.
     * For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the template.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateTemplateRequestTags> tags;

    /**
     * <p>The structure of the template body. The template body must be 1 to 524,288 bytes in length. If the template body is large, specify the parameter in the request body to prevent request failures caused by an excessively long URL.</p>
     * <blockquote>
     * <p>You can specify only one of the \<code>TemplateBody\\</code>, \<code>TemplateURL\\</code>, and \<code>TemplateId\\</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The name of the template. The name can be up to 255 characters in length. It must start with a digit, letter, or Chinese character. It can contain digits, letters, Chinese characters, hyphens (-), and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on a web server (HTTP or HTTPS) or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss\://ros/stack-policy/demo or oss\://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body must be 1 to 1,024 bytes in length. If you do not specify the region of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <blockquote>
     * <p>You must specify only one of the \<code>TemplateBody\\</code> and \<code>TemplateURL\\</code> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://ros/template/demo</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The validation options.</p>
     * <p>By default, no options are enabled and strict validation is performed.</p>
     */
    @NameInMap("ValidationOptions")
    public java.util.List<String> validationOptions;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTemplateRequest setTags(java.util.List<CreateTemplateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTemplateRequestTags> getTags() {
        return this.tags;
    }

    public CreateTemplateRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateTemplateRequest setValidationOptions(java.util.List<String> validationOptions) {
        this.validationOptions = validationOptions;
        return this;
    }
    public java.util.List<String> getValidationOptions() {
        return this.validationOptions;
    }

    public static class CreateTemplateRequestTags extends TeaModel {
        /**
         * <p>The tag key of the template.</p>
         * <blockquote>
         * <p>Tags is an optional parameter. If you specify Tags, you must specify \<code>Tags.N.Key\\</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTemplateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestTags self = new CreateTemplateRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
