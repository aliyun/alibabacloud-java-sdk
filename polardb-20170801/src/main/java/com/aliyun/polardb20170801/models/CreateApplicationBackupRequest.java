// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationBackupRequest extends TeaModel {
    /**
     * <p>The ID of the application to back up.</p>
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
     * <p>The backup mode. Automated indicates an automatic backup, and Manual indicates a manual backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("JobMode")
    public String jobMode;

    /**
     * <p>The ID of the region where the application resides. The server uses the actual region of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateApplicationBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationBackupRequest self = new CreateApplicationBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationBackupRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationBackupRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public CreateApplicationBackupRequest setJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }
    public String getJobMode() {
        return this.jobMode;
    }

    public CreateApplicationBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
