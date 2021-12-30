// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class InitDBInstanceResourceGroupIdRequest extends TeaModel {
    // 资源类型
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static InitDBInstanceResourceGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        InitDBInstanceResourceGroupIdRequest self = new InitDBInstanceResourceGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public InitDBInstanceResourceGroupIdRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public InitDBInstanceResourceGroupIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
