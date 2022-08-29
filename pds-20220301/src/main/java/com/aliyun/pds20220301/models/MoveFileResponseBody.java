// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class MoveFileResponseBody extends TeaModel {
    @NameInMap("async_task_id")
    public String asyncTaskId;

    @NameInMap("domain_id")
    public String domainId;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("exist")
    public Boolean exist;

    @NameInMap("file_id")
    public String fileId;

    public static MoveFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveFileResponseBody self = new MoveFileResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveFileResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public MoveFileResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public MoveFileResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public MoveFileResponseBody setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public MoveFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
