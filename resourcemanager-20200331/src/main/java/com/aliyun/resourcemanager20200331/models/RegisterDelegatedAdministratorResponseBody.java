// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A45FC8F-54D2-4A65-8338-25E5DEBDA304</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterDelegatedAdministratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterDelegatedAdministratorResponseBody self = new RegisterDelegatedAdministratorResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterDelegatedAdministratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
