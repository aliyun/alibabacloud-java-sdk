// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseReadWriteSplittingConnectionRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static ReleaseReadWriteSplittingConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseReadWriteSplittingConnectionRequest self = new ReleaseReadWriteSplittingConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseReadWriteSplittingConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
