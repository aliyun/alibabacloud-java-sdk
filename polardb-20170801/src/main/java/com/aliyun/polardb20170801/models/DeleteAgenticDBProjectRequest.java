// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBProjectRequest extends TeaModel {
    /**
     * <p>The ID of the AgenticDB cluster. The ID must start with pagc-. You can obtain the ID by calling the CreateDBCluster operation and setting AgenticDbType to dedicated. Regular cluster IDs that start with pc- are not supported. Usage notes: Append the following format note to the end of the description for the DBClusterId parameter: The ID must be prefixed with pagc-, and regular PolarDB cluster IDs (prefixed with pc-) are not supported by this API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the target project. You can obtain the ID after creating a project by calling CreateAgenticDBProject.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>proj-a1b2c3d4e5f6</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

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
     * <p>The ID of the tenant. You can obtain the ID after creating a tenant by calling CreateAgenticDBTenant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteAgenticDBProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBProjectRequest self = new DeleteAgenticDBProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBProjectRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAgenticDBProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteAgenticDBProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAgenticDBProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
