// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableRightsSeparationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("AuditAccountDescription")
    public String auditAccountDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_audit</p>
     */
    @NameInMap("AuditAccountName")
    public String auditAccountName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuditAccountPassword")
    public String auditAccountPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0ori2r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("SecurityAccountDescription")
    public String securityAccountDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_sec</p>
     */
    @NameInMap("SecurityAccountName")
    public String securityAccountName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("SecurityAccountPassword")
    public String securityAccountPassword;

    public static EnableRightsSeparationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRightsSeparationRequest self = new EnableRightsSeparationRequest();
        return TeaModel.build(map, self);
    }

    public EnableRightsSeparationRequest setAuditAccountDescription(String auditAccountDescription) {
        this.auditAccountDescription = auditAccountDescription;
        return this;
    }
    public String getAuditAccountDescription() {
        return this.auditAccountDescription;
    }

    public EnableRightsSeparationRequest setAuditAccountName(String auditAccountName) {
        this.auditAccountName = auditAccountName;
        return this;
    }
    public String getAuditAccountName() {
        return this.auditAccountName;
    }

    public EnableRightsSeparationRequest setAuditAccountPassword(String auditAccountPassword) {
        this.auditAccountPassword = auditAccountPassword;
        return this;
    }
    public String getAuditAccountPassword() {
        return this.auditAccountPassword;
    }

    public EnableRightsSeparationRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public EnableRightsSeparationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableRightsSeparationRequest setSecurityAccountDescription(String securityAccountDescription) {
        this.securityAccountDescription = securityAccountDescription;
        return this;
    }
    public String getSecurityAccountDescription() {
        return this.securityAccountDescription;
    }

    public EnableRightsSeparationRequest setSecurityAccountName(String securityAccountName) {
        this.securityAccountName = securityAccountName;
        return this;
    }
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    public EnableRightsSeparationRequest setSecurityAccountPassword(String securityAccountPassword) {
        this.securityAccountPassword = securityAccountPassword;
        return this;
    }
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

}
