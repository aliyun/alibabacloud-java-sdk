// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test_daa</p>
     */
    @NameInMap("AuditAccountName")
    public String auditAccountName;

    /**
     * <strong>example:</strong>
     * <p>Pw@11111</p>
     */
    @NameInMap("AuditAccountPassword")
    public String auditAccountPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-****************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSqlAuditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditInfoRequest self = new DescribeSqlAuditInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditInfoRequest setAuditAccountName(String auditAccountName) {
        this.auditAccountName = auditAccountName;
        return this;
    }
    public String getAuditAccountName() {
        return this.auditAccountName;
    }

    public DescribeSqlAuditInfoRequest setAuditAccountPassword(String auditAccountPassword) {
        this.auditAccountPassword = auditAccountPassword;
        return this;
    }
    public String getAuditAccountPassword() {
        return this.auditAccountPassword;
    }

    public DescribeSqlAuditInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSqlAuditInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
