// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckInstanceExistRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static CheckInstanceExistRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceExistRequest self = new CheckInstanceExistRequest();
        return TeaModel.build(map, self);
    }

    public CheckInstanceExistRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
