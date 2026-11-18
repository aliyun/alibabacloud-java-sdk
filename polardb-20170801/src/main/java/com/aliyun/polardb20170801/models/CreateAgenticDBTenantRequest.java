// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBTenantRequest extends TeaModel {
    /**
     * <p>The AgenticDB cluster ID, which starts with pagc-. You can obtain this ID after creating a cluster by calling CreateDBCluster with AgenticDbType set to dedicated. Standard PolarDB cluster IDs start with pc- and are not supported by this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The tenant description. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample tenant</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The tenant name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-tenant</p>
     */
    @NameInMap("TenantName")
    public String tenantName;

    public static CreateAgenticDBTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBTenantRequest self = new CreateAgenticDBTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBTenantRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgenticDBTenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgenticDBTenantRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAgenticDBTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
