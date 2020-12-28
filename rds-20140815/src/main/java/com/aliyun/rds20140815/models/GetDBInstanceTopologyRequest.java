// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDBInstanceTopologyRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static GetDBInstanceTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceTopologyRequest self = new GetDBInstanceTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceTopologyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
