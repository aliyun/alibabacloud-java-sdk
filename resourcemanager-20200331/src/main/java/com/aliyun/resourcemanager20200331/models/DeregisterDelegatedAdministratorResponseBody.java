// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeregisterDelegatedAdministratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DF5D5C52-7BD0-40E7-94C6-23A1505038A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeregisterDelegatedAdministratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeregisterDelegatedAdministratorResponseBody self = new DeregisterDelegatedAdministratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeregisterDelegatedAdministratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
