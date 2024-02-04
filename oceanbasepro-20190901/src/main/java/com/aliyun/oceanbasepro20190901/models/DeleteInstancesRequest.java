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
     * <p>Specifies whether to perform only a dry run for the request. Default value: false. Valid values:</p>
     * <p>- true: Only a dry-run request is sent and the instance is not deleted. If the dry run succeeds, DryRunResult=true is returned. If the dry run fails, an error code is returned.</p>
     * <p>- false: The actual request is sent and no dry run is performed. The instance is deleted if the requirements are met. By default, false is returned for the parameter DryRunResult if you set DryRun to false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

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

    public DeleteInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
