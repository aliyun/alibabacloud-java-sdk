// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReadDBInstanceDelayRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ReadInstanceId")
    @Validation(required = true)
    public String readInstanceId;

    public static DescribeReadDBInstanceDelayRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReadDBInstanceDelayRequest self = new DescribeReadDBInstanceDelayRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReadDBInstanceDelayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeReadDBInstanceDelayRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReadDBInstanceDelayRequest setReadInstanceId(String readInstanceId) {
        this.readInstanceId = readInstanceId;
        return this;
    }
    public String getReadInstanceId() {
        return this.readInstanceId;
    }

}
