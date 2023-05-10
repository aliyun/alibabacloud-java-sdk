// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class RegisterResourceTypeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TemplateBody")
    public String templateBody;

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
