// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    @NameInMap("BackupRetainMode")
    public String backupRetainMode;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesRequest setBackupRetainMode(String backupRetainMode) {
        this.backupRetainMode = backupRetainMode;
        return this;
    }
    public String getBackupRetainMode() {
        return this.backupRetainMode;
    }

    public DeleteInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
