// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeregisterDelegatedAdministratorRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

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
