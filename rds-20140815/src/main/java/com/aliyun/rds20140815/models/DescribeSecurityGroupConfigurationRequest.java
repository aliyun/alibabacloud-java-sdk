// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static DescribeSecurityGroupConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationRequest self = new DescribeSecurityGroupConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
