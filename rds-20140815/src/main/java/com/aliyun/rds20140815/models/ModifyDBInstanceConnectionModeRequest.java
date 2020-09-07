// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionModeRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConnectionMode")
    @Validation(required = true)
    public String connectionMode;

    public static ModifyDBInstanceConnectionModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionModeRequest self = new ModifyDBInstanceConnectionModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionModeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConnectionModeRequest setConnectionMode(String connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }
    public String getConnectionMode() {
        return this.connectionMode;
    }

}
