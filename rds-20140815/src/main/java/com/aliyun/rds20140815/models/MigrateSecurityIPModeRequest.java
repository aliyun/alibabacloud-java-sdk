// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateSecurityIPModeRequest extends TeaModel {
    // description: The ID of the instance. ; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static MigrateSecurityIPModeRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateSecurityIPModeRequest self = new MigrateSecurityIPModeRequest();
        return TeaModel.build(map, self);
    }

    public MigrateSecurityIPModeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
