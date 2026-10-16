// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>The suffix of the role name.</p>
     * <p>The total length of the role name (including the suffix) must be 1 to 64 characters and can contain letters, digits, periods (.), and hyphens (-).</p>
     * <p>For example, if the suffix is <code>Example</code>, the role name is <code>ServiceLinkedRoleName_Example</code>, and the maximum length cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Example</p>
     */
    @NameInMap("CustomSuffix")
    public String customSuffix;

    /**
     * <p>The description of the service-linked role.</p>
     * <p>Only service-linked roles that allow custom suffixes can have a custom role description. Otherwise, the role description uses a preset value and cannot be modified.</p>
     * <p>The description must be 1 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Service Linked Role for PolarDB. PolarDB will use this role to access your resources in other services.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The service name.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/461722.html">Cloud services that support service-linked roles</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb.aliyuncs.com</p>
     */
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
