// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableSqlAuditRequest extends TeaModel {
    /**
     * <p>The name of the audit administrator account. &gt; If the three-role mode is enabled, this parameter is required. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test_daa</p>
     */
    @NameInMap("AuditAccountName")
    public String auditAccountName;

    /**
     * <p>The password of the audit administrator account. &gt; If the three-role mode is enabled, this parameter is required. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw@11111</p>
     */
    @NameInMap("AuditAccountPassword")
    public String auditAccountPassword;

    /**
     * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-****************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region ID of the instance. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlAuditRequest self = new DisableSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public DisableSqlAuditRequest setAuditAccountName(String auditAccountName) {
        this.auditAccountName = auditAccountName;
        return this;
    }
    public String getAuditAccountName() {
        return this.auditAccountName;
    }

    public DisableSqlAuditRequest setAuditAccountPassword(String auditAccountPassword) {
        this.auditAccountPassword = auditAccountPassword;
        return this;
    }
    public String getAuditAccountPassword() {
        return this.auditAccountPassword;
    }

    public DisableSqlAuditRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DisableSqlAuditRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
