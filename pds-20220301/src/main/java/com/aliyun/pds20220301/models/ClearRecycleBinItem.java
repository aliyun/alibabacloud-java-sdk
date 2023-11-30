// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ClearRecycleBinItem extends TeaModel {
    @NameInMap("async_task_id")
    public String asyncTaskId;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("task_id")
    public String taskId;

    public static ClearRecycleBinItem build(java.util.Map<String, ?> map) throws Exception {
        ClearRecycleBinItem self = new ClearRecycleBinItem();
        return TeaModel.build(map, self);
    }

    public ClearRecycleBinItem setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public ClearRecycleBinItem setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ClearRecycleBinItem setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ClearRecycleBinItem setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
