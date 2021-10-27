// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CheckCloudResourceAuthorizedRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleArn")
    public String roleArn;

    public static CheckCloudResourceAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCloudResourceAuthorizedRequest self = new CheckCloudResourceAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public CheckCloudResourceAuthorizedRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CheckCloudResourceAuthorizedRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCloudResourceAuthorizedRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
