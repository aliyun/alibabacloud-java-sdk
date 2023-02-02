// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    /**
     * <p>The backup retention strategy for cluster deletion. Valid values:  </p>
     * <p>- receive_all: retains all backup sets.   </p>
     * <p>- delete_all: deletes all backup sets.   </p>
     * <p>- receive_last: retains the last backup set.    </p>
     * <br>
     * <p>> <br>Default value: delete_all.</p>
     */
    @NameInMap("BackupRetainMode")
    public String backupRetainMode;

    /**
     * <p>The ID of the cluster to be deleted.   </p>
     * <p>The value is a string in the JSON format.</p>
     */
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
