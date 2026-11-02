// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyPxfsTenantQuotaRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0ori2r****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The capacity quota.</p>
     * 
     * <strong>example:</strong>
     * <p>107374182400</p>
     */
    @NameInMap("QuotaBytes")
    public Long quotaBytes;

    /**
     * <p>The file count quota.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("QuotaFiles")
    public Long quotaFiles;

    /**
     * <p>The request rate limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RateLimitRps")
    public Long rateLimitRps;

    /**
     * <p>The write bandwidth limit.</p>
     * 
     * <strong>example:</strong>
     * <p>104857600</p>
     */
    @NameInMap("RateLimitWbps")
    public Long rateLimitWbps;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant-001</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyPxfsTenantQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPxfsTenantQuotaRequest self = new ModifyPxfsTenantQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPxfsTenantQuotaRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyPxfsTenantQuotaRequest setQuotaBytes(Long quotaBytes) {
        this.quotaBytes = quotaBytes;
        return this;
    }
    public Long getQuotaBytes() {
        return this.quotaBytes;
    }

    public ModifyPxfsTenantQuotaRequest setQuotaFiles(Long quotaFiles) {
        this.quotaFiles = quotaFiles;
        return this;
    }
    public Long getQuotaFiles() {
        return this.quotaFiles;
    }

    public ModifyPxfsTenantQuotaRequest setRateLimitRps(Long rateLimitRps) {
        this.rateLimitRps = rateLimitRps;
        return this;
    }
    public Long getRateLimitRps() {
        return this.rateLimitRps;
    }

    public ModifyPxfsTenantQuotaRequest setRateLimitWbps(Long rateLimitWbps) {
        this.rateLimitWbps = rateLimitWbps;
        return this;
    }
    public Long getRateLimitWbps() {
        return this.rateLimitWbps;
    }

    public ModifyPxfsTenantQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPxfsTenantQuotaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
