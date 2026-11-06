// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the created backup job.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111</p>
     */
    @NameInMap("BackupJobId")
    public String backupJobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the workflow task corresponding to the backup creation.</p>
     * 
     * <strong>example:</strong>
     * <p>32077061</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateApplicationBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationBackupResponseBody self = new CreateApplicationBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationBackupResponseBody setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

    public CreateApplicationBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationBackupResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
