// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The identifier of the trusted service.</p>
     * <br>
     * <p>For more information, see the `Trusted service identifier` column in [Supported trusted services](~~208133~~).</p>
     */
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
