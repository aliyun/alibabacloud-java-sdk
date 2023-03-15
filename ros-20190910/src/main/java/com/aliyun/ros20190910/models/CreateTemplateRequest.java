// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    /**
     * <p>The description of the template. The description can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see the "Resource Group" section of [What is Resource Management?](~~94475~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateTemplateRequestTags> tags;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <p>>  You must specify the TemplateBody or TemplateURL parameter.</p>
     * <br>
     * <p>You can create a Terraform template based on your business requirements. The following sample code provides an example on how to create a Terraform template:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>  "ROSTemplateFormatVersion": "2015-09-01",</p>
     * <p>  "Transform": "Aliyun::Terraform-v1.0",</p>
     * <p>  "Workspace": {</p>
     * <p>    "main.tf": "variable  \"name\" {  default = \"auto_provisioning_group\"}"</p>
     * <p>  },</p>
     * <p>  "Outputs": {}</p>
     * <p>}</p>
     * <p>```</p>
     * <br>
     * <p>For more information about Terraform templates, see [Structure of Terraform templates](~~184397~~).</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The name of the template.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou.</p>
     * <br>
     * <p>The template body must be 1 to 1,024 bytes in length.</p>
     * <br>
     * <p>If you do not specify the region of the OSS bucket, the value of the RegionId parameter is used.</p>
     * <br>
     * <p>>  You must specify the TemplateBody or TemplateURL parameter.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

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

    public static class CreateTemplateRequestTags extends TeaModel {
        /**
         * <p>The key of tag N that you want to add to the template.</p>
         * <br>
         * <p>>  The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that you want to add to the template.</p>
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
