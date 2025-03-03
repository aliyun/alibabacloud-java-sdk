// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorRequest extends TeaModel {
    /**
     * <p>The ID of the member in the resource directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>181761095690****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The identifier of the trusted service.</p>
     * <p>For more information, see the <code>Trusted service identifier</code> column in <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudfw.aliyuncs.com</p>
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
