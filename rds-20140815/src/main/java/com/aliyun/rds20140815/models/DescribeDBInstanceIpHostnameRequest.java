// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIpHostnameRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    // description: RDS实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: RDS实例的地域ID，可以通过接口[DescribeRegions](~~26243~~)查看。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeDBInstanceIpHostnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIpHostnameRequest self = new DescribeDBInstanceIpHostnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIpHostnameRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDBInstanceIpHostnameRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceIpHostnameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
