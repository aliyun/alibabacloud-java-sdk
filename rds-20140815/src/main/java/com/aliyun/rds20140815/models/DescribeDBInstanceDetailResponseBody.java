// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("LicenseType")
    public String licenseType;

    @NameInMap("ActivationState")
    public String activationState;

    public static DescribeDBInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDetailResponseBody self = new DescribeDBInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceDetailResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstanceDetailResponseBody setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public DescribeDBInstanceDetailResponseBody setActivationState(String activationState) {
        this.activationState = activationState;
        return this;
    }
    public String getActivationState() {
        return this.activationState;
    }

}
