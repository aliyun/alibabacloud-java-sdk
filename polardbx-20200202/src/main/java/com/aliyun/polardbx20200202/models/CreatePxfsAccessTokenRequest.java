// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsAccessTokenRequest extends TeaModel {
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
     * <p>The name of the identity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent-runtime</p>
     */
    @NameInMap("IdentityName")
    public String identityName;

    /**
     * <p>The label of the token.</p>
     * 
     * <strong>example:</strong>
     * <p>production-agent</p>
     */
    @NameInMap("Label")
    public String label;

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
     * <p>The validity period of the token.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("TtlSeconds")
    public Long ttlSeconds;

    public static CreatePxfsAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsAccessTokenRequest self = new CreatePxfsAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreatePxfsAccessTokenRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreatePxfsAccessTokenRequest setIdentityName(String identityName) {
        this.identityName = identityName;
        return this;
    }
    public String getIdentityName() {
        return this.identityName;
    }

    public CreatePxfsAccessTokenRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreatePxfsAccessTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePxfsAccessTokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreatePxfsAccessTokenRequest setTtlSeconds(Long ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
        return this;
    }
    public Long getTtlSeconds() {
        return this.ttlSeconds;
    }

}
