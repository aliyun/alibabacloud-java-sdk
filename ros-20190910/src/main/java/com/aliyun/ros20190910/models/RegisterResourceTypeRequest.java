// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\\</p>
     * <p>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).\\</p>
     * <p>For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/134212.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the resource type. The description can be up to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The entity type. Set the value to Module.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The resource type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. The template body is used as the module content. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <br>
     * <br>
     * <p>> - This parameter takes effect only when EntityType is set to Module.</p>
     * <p>> - You can specify only one of the TemplateBody and TemplateURL parameters.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. The template body is used as the module content.</p>
     * <br>
     * <p>> - If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</p>
     * <p>> -  This parameter takes effect only when EntityType is set to Module.</p>
     * <p>> -  You can specify only one of the TemplateBody and TemplateURL parameters.</p>
     * <br>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    public static RegisterResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterResourceTypeRequest self = new RegisterResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public RegisterResourceTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterResourceTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegisterResourceTypeRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public RegisterResourceTypeRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public RegisterResourceTypeRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public RegisterResourceTypeRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

}
