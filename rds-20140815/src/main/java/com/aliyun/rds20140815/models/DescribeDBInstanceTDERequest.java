// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDERequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static DescribeDBInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDERequest self = new DescribeDBInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDERequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
