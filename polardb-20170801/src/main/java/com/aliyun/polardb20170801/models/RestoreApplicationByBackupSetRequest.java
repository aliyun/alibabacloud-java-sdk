// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestoreApplicationByBackupSetRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The ID of the backup set used to restore the application. Usage notes: This parameter is required. If this parameter is not provided, the API returns the InvalidBackupSetID.NotFound (404) error.</p>
     * 
     * <strong>example:</strong>
     * <p>bs-123456</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The ID of the region where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RestoreApplicationByBackupSetRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreApplicationByBackupSetRequest self = new RestoreApplicationByBackupSetRequest();
        return TeaModel.build(map, self);
    }

    public RestoreApplicationByBackupSetRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RestoreApplicationByBackupSetRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public RestoreApplicationByBackupSetRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public RestoreApplicationByBackupSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
