// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDetailResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the instance is in the active state.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid</p>
     */
    @NameInMap("ActivationState")
    public String activationState;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of the license.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("LicenseType")
    public String licenseType;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06B220E2-EAC5-4DBE-A1FC-1B62DB6A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDetailResponseBody self = new DescribeDBInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDetailResponseBody setActivationState(String activationState) {
        this.activationState = activationState;
        return this;
    }
    public String getActivationState() {
        return this.activationState;
    }

    public DescribeDBInstanceDetailResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceDetailResponseBody setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }
    public String getLicenseType() {
        return this.licenseType;
    }

    public DescribeDBInstanceDetailResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
