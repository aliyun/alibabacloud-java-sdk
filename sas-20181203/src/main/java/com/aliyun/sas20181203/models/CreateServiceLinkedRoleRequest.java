// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
     * <ul>
     * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role of Security Center. Security Center assumes this role to access the resources of other cloud services within your account.</li>
     * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role of Security Center-CSPM. Security Center-CSPM assumes this role to access the resources of other cloud services within your account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForSas</p>
     */
    @NameInMap("ServiceLinkedRole")
    public String serviceLinkedRole;

    public static CreateServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleRequest self = new CreateServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleRequest setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
        return this;
    }
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

}
