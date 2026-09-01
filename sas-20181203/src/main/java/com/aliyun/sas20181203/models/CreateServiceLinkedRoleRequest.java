// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
     * <ul>
     * <li><strong>AliyunServiceRoleForSas</strong>: the service-linked role for Security Center (SAS). Security Center uses this role to access your resources in other cloud services.</li>
     * <li><strong>AliyunServiceRoleForSasCspm</strong>: the service-linked role for Security Center - Cloud Security Posture Management (CSPM). SAS-CSPM uses this role to access your resources in other cloud services.</li>
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

    public CreateServiceLinkedRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceLinkedRoleRequest setServiceLinkedRole(String serviceLinkedRole) {
        this.serviceLinkedRole = serviceLinkedRole;
        return this;
    }
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

}
