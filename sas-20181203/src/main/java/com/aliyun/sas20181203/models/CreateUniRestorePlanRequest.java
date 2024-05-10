// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniRestorePlanRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The UUID of the Hybrid Backup Recovery (HBR) agent that is used to restore the data of the database on your server.</p>
     * <br>
     * <p>>  You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the UUID.</p>
     */
    @NameInMap("InstanceUuid")
    public String instanceUuid;

    /**
     * <p>The ID of the anti-ransomware policy.</p>
     * <br>
     * <p>>  You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>The identifier of the point in time for restoration in the backup version that you want to use. The database is an Oracle database.****</p>
     * <br>
     * <p>>  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the value.</p>
     */
    @NameInMap("ResetScn")
    public String resetScn;

    /**
     * <p>The point in time for restoration in the backup version that you want to use. The database is an Oracle database.****</p>
     * <br>
     * <p>>  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the value.</p>
     */
    @NameInMap("ResetTime")
    public String resetTime;

    /**
     * <p>The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:</p>
     * <br>
     * <p>*   **name**: the name of the database</p>
     * <p>*   **files**: the path to the database files</p>
     * <br>
     * <p>>  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the information.</p>
     */
    @NameInMap("RestoreInfo")
    public String restoreInfo;

    /**
     * <p>The point in time to which you want to restore data.</p>
     * <br>
     * <p>>  You can call the [DescribeRestorePlans](~~DescribeRestorePlans~~) operation to query the point in time.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimePoint")
    public Long timePoint;

    public static CreateUniRestorePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniRestorePlanRequest self = new CreateUniRestorePlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniRestorePlanRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public CreateUniRestorePlanRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public CreateUniRestorePlanRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreateUniRestorePlanRequest setResetScn(String resetScn) {
        this.resetScn = resetScn;
        return this;
    }
    public String getResetScn() {
        return this.resetScn;
    }

    public CreateUniRestorePlanRequest setResetTime(String resetTime) {
        this.resetTime = resetTime;
        return this;
    }
    public String getResetTime() {
        return this.resetTime;
    }

    public CreateUniRestorePlanRequest setRestoreInfo(String restoreInfo) {
        this.restoreInfo = restoreInfo;
        return this;
    }
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

    public CreateUniRestorePlanRequest setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public Long getTimePoint() {
        return this.timePoint;
    }

}
