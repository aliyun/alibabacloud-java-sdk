// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceShrinkRequest extends TeaModel {
    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The client token used to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of modules.</p>
     */
    @NameInMap("Components")
    public String componentsShrink;

    /**
     * <p>The instance ID of the ApsaraDB RDS for PostgreSQL database connected to the AI application.</p>
     * <p><notice>Only <strong>newly purchased empty ApsaraDB RDS for PostgreSQL instances</strong> are supported. The major engine version must be <strong>17</strong>, and the minor engine version must be <strong>20250630 or later</strong>.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>pgm-2ze49qv594vi****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The instance type. Currently, only <strong>rdsai.supabase.basic</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>rdsai.supabase.basic</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID of the AI application.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Reserved parameter</p>
     */
    @NameInMap("MigrationMode")
    public String migrationMode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAppInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceShrinkRequest self = new ModifyAppInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceShrinkRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public ModifyAppInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAppInstanceShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public ModifyAppInstanceShrinkRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyAppInstanceShrinkRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public ModifyAppInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyAppInstanceShrinkRequest setMigrationMode(String migrationMode) {
        this.migrationMode = migrationMode;
        return this;
    }
    public String getMigrationMode() {
        return this.migrationMode;
    }

    public ModifyAppInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
