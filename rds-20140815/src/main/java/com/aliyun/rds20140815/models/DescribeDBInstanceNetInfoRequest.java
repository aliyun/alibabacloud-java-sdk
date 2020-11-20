// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Flag")
    public Integer flag;

    @NameInMap("DBInstanceNetRWSplitType")
    public String DBInstanceNetRWSplitType;

    public static DescribeDBInstanceNetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoRequest self = new DescribeDBInstanceNetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDBInstanceNetInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceNetInfoRequest setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }
    public Integer getFlag() {
        return this.flag;
    }

    public DescribeDBInstanceNetInfoRequest setDBInstanceNetRWSplitType(String DBInstanceNetRWSplitType) {
        this.DBInstanceNetRWSplitType = DBInstanceNetRWSplitType;
        return this;
    }
    public String getDBInstanceNetRWSplitType() {
        return this.DBInstanceNetRWSplitType;
    }

}
