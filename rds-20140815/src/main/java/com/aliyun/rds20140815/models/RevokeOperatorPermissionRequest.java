// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeOperatorPermissionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static RevokeOperatorPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeOperatorPermissionRequest self = new RevokeOperatorPermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeOperatorPermissionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
