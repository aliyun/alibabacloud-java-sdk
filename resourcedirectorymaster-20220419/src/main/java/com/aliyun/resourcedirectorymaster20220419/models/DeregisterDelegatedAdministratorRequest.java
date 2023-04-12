// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeregisterDelegatedAdministratorRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The identifier of the trusted service.</p>
     */
    @NameInMap("ServicePrincipal")
    public String servicePrincipal;

    public static DeregisterDelegatedAdministratorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeregisterDelegatedAdministratorRequest self = new DeregisterDelegatedAdministratorRequest();
        return TeaModel.build(map, self);
    }

    public DeregisterDelegatedAdministratorRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeregisterDelegatedAdministratorRequest setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

}
