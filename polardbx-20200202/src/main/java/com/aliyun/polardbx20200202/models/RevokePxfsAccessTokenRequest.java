// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RevokePxfsAccessTokenRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID.</p>
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

    /**
     * <p>Token ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token-001</p>
     */
    @NameInMap("TokenId")
    public String tokenId;

    public static RevokePxfsAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePxfsAccessTokenRequest self = new RevokePxfsAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokePxfsAccessTokenRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public RevokePxfsAccessTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokePxfsAccessTokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RevokePxfsAccessTokenRequest setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    public String getTokenId() {
        return this.tokenId;
    }

}
