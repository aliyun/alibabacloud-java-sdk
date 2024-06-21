// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\
     * The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).\
     * For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the resource type. The description can be up to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>It is a demo.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The entity type. Set the value to Module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Module</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. The template body is used as the module content. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when EntityType is set to Module.</li>
     * <li>You can specify only one of the TemplateBody and TemplateURL parameters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. The template body is used as the module content.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</li>
     * <li>This parameter takes effect only when EntityType is set to Module.</li>
     * <li>You can specify only one of the TemplateBody and TemplateURL parameters.</li>
     * </ul>
     * </blockquote>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://ros-template/demo</p>
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
