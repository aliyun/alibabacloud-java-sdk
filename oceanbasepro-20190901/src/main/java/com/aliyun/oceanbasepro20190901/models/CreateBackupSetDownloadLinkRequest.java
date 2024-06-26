// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupSetDownloadLinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bak-6f****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateBackupSetDownloadLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupSetDownloadLinkRequest self = new CreateBackupSetDownloadLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupSetDownloadLinkRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateBackupSetDownloadLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
