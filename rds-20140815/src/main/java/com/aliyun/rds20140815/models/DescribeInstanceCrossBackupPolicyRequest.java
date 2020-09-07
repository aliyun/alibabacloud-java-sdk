// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyRequest extends TeaModel {
    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 地域ID，可以通过接口[DescribeRegions](~~26243~~)查看地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeInstanceCrossBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyRequest self = new DescribeInstanceCrossBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCrossBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeInstanceCrossBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
