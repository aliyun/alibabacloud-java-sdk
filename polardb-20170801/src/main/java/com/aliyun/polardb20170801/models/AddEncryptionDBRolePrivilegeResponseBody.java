// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddEncryptionDBRolePrivilegeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddEncryptionDBRolePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEncryptionDBRolePrivilegeResponseBody self = new AddEncryptionDBRolePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEncryptionDBRolePrivilegeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddEncryptionDBRolePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
