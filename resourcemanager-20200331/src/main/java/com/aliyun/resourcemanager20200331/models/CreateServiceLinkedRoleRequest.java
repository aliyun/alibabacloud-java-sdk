// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("CustomSuffix")
    public String customSuffix;

    @NameInMap("Description")
    public String description;

    @NameInMap("ServiceName")
    public String serviceName;

    public static CreateServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleRequest self = new CreateServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleRequest setCustomSuffix(String customSuffix) {
        this.customSuffix = customSuffix;
        return this;
    }
    public String getCustomSuffix() {
        return this.customSuffix;
    }

    public CreateServiceLinkedRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceLinkedRoleRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
