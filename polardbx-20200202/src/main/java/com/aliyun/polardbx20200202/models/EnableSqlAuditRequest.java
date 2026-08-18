// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableSqlAuditRequest extends TeaModel {
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
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-****************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The number of days for which audit logs are retained.</p>
     * <ul>
     * <li><p>0: Logs are not retained. Automatic log expiration is disabled.</p>
     * </li>
     * <li><p>Greater than 0: Logs are automatically deleted after N days.</p>
     * </li>
     * <li><p>Common values: 30, 45, 90, 180, and 365.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("ExpireAfterDays")
    public Integer expireAfterDays;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditRequest self = new EnableSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditRequest setAuditAccountName(String auditAccountName) {
        this.auditAccountName = auditAccountName;
        return this;
    }
    public String getAuditAccountName() {
        return this.auditAccountName;
    }

    public EnableSqlAuditRequest setAuditAccountPassword(String auditAccountPassword) {
        this.auditAccountPassword = auditAccountPassword;
        return this;
    }
    public String getAuditAccountPassword() {
        return this.auditAccountPassword;
    }

    public EnableSqlAuditRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EnableSqlAuditRequest setExpireAfterDays(Integer expireAfterDays) {
        this.expireAfterDays = expireAfterDays;
        return this;
    }
    public Integer getExpireAfterDays() {
        return this.expireAfterDays;
    }

    public EnableSqlAuditRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
