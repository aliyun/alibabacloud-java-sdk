// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DeleteBackupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bk-yi2378sdhf2</p>
     */
    @NameInMap("BackupTaskId")
    public String backupTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupRequest self = new DeleteBackupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupRequest setBackupTaskId(String backupTaskId) {
        this.backupTaskId = backupTaskId;
        return this;
    }
    public String getBackupTaskId() {
        return this.backupTaskId;
    }

    public DeleteBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
