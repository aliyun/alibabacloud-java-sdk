// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceProxyConfigurationRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static DescribeDBInstanceProxyConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceProxyConfigurationRequest self = new DescribeDBInstanceProxyConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceProxyConfigurationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
