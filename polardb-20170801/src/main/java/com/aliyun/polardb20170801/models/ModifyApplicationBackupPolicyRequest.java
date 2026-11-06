// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationBackupPolicyRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type, such as polarclaw.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The days of the week when automatic backups are performed. Separate multiple values with commas. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The retention period of level-1 backups, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PreferredBackupRetentionPeriod")
    public String preferredBackupRetentionPeriod;

    /**
     * <p>The time window when automatic backups are performed. The format is HH:mmZ-HH:mmZ in UTC. The start time and end time must be on the hour and exactly one hour apart.</p>
     * 
     * <strong>example:</strong>
     * <p>07:00Z-08:00Z</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The region ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyApplicationBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationBackupPolicyRequest self = new ModifyApplicationBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationBackupPolicyRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationBackupPolicyRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public ModifyApplicationBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyApplicationBackupPolicyRequest setPreferredBackupRetentionPeriod(String preferredBackupRetentionPeriod) {
        this.preferredBackupRetentionPeriod = preferredBackupRetentionPeriod;
        return this;
    }
    public String getPreferredBackupRetentionPeriod() {
        return this.preferredBackupRetentionPeriod;
    }

    public ModifyApplicationBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyApplicationBackupPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
