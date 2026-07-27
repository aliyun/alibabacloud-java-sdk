// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetInstancePasswordRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The Supabase Dashboard password.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <p>The RDS database access password.</p>
     * <p>The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and underscores (_).</p>
     * <blockquote>
     * <p>Notice: This password change also updates the access passwords of the following accounts on the associated PostgreSQL instance. These accounts are required by Supabase: postgres, supabase_admin, supabase_auth_admin, supabase_functions_admin, supabase_storage_admin, authenticator, pgbouncer.
     * </notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_Password</p>
     */
    @NameInMap("DatabasePassword")
    public String databasePassword;

    /**
     * <p>The instance ID of the AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetInstancePasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetInstancePasswordRequest self = new ResetInstancePasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetInstancePasswordRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public ResetInstancePasswordRequest setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public ResetInstancePasswordRequest setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
        return this;
    }
    public String getDatabasePassword() {
        return this.databasePassword;
    }

    public ResetInstancePasswordRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ResetInstancePasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
