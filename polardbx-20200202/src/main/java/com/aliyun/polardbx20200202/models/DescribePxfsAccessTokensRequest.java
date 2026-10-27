// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsAccessTokensRequest extends TeaModel {
    /**
     * <p>The PolarDB-X instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The identity name.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-runtime</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

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

    public static DescribePxfsAccessTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsAccessTokensRequest self = new DescribePxfsAccessTokensRequest();
        return TeaModel.build(map, self);
    }

    public DescribePxfsAccessTokensRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribePxfsAccessTokensRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public DescribePxfsAccessTokensRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePxfsAccessTokensRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
