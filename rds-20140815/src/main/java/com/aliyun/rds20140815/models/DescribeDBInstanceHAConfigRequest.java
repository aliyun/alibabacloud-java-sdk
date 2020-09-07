// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceHAConfigRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static DescribeDBInstanceHAConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceHAConfigRequest self = new DescribeDBInstanceHAConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceHAConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
