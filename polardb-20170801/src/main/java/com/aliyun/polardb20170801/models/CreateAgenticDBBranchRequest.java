// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAgenticDBBranchRequest extends TeaModel {
    /**
     * <p>The name of the branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feature-analytics</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The AgenticDB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Feature branch for analytics</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the parent branch. By default, the branch is derived from the main branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-1a2b3c4d5e6f</p>
     */
    @NameInMap("ParentBranchId")
    public String parentBranchId;

    /**
     * <p>Creates the branch based on the data of the parent branch at the specified point in time. If you do not specify this parameter, the latest data is used. The value must be in RFC 3339 format with a time zone and support up to nine fractional digits for seconds. Empty strings and future times are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-15T07:32:00.123456Z</p>
     */
    @NameInMap("ParentTimestamp")
    public String parentTimestamp;

    /**
     * <p>The project ID.</p>
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
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-4b83e0da66674951</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static CreateAgenticDBBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticDBBranchRequest self = new CreateAgenticDBBranchRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticDBBranchRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateAgenticDBBranchRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgenticDBBranchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgenticDBBranchRequest setParentBranchId(String parentBranchId) {
        this.parentBranchId = parentBranchId;
        return this;
    }
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    public CreateAgenticDBBranchRequest setParentTimestamp(String parentTimestamp) {
        this.parentTimestamp = parentTimestamp;
        return this;
    }
    public String getParentTimestamp() {
        return this.parentTimestamp;
    }

    public CreateAgenticDBBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateAgenticDBBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAgenticDBBranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
