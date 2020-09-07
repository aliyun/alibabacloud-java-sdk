// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeResponse extends TeaModel {
    // description: The ID of the request. ; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: The ID of the instance. ; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: The mode of the whitelist after the switch. Valid values:**safety**.; 
    @NameInMap("SecurityIPMode")
    @Validation(required = true)
    public String securityIPMode;

    public static MigrateSecurityIPModeResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateSecurityIPModeResponse self = new MigrateSecurityIPModeResponse();
        return TeaModel.build(map, self);
    }

    public MigrateSecurityIPModeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateSecurityIPModeResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateSecurityIPModeResponse setSecurityIPMode(String securityIPMode) {
        this.securityIPMode = securityIPMode;
        return this;
    }
    public String getSecurityIPMode() {
        return this.securityIPMode;
    }

}
