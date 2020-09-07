// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Region")
    public String region;

    public static DescribeLocalAvailableRecoveryTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeRequest self = new DescribeLocalAvailableRecoveryTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLocalAvailableRecoveryTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeLocalAvailableRecoveryTimeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
