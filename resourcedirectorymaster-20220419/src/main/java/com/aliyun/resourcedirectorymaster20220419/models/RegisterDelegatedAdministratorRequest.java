// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ServicePrincipal")
    public String servicePrincipal;

    public static RegisterDelegatedAdministratorRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDelegatedAdministratorRequest self = new RegisterDelegatedAdministratorRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDelegatedAdministratorRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public RegisterDelegatedAdministratorRequest setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }
    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

}
