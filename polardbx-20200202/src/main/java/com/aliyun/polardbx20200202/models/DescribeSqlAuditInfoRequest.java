// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditInfoRequest extends TeaModel {
    /**
     * <p>The name of the audit administrator account. &gt; This parameter is required if the three-role mode is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>test_daa</p>
     */
    @NameInMap("AuditAccountName")
    public String auditAccountName;

    /**
     * <p>The password of the audit administrator account. &gt; This parameter is required if the three-role mode is enabled. For more information about the three-role mode, see <a href="https://help.aliyun.com/document_detail/213824.html">Three-role mode</a>.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AuditAccountPassword")
    public String auditAccountPassword;

    /**
     * <p>The instance ID. &gt; You can call <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> to query the details of all instances in the specified region, including instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-****************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the region where the instance resides. &gt; You can call <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> to query the regions supported by PolarDB-X, including region IDs.</p>
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
