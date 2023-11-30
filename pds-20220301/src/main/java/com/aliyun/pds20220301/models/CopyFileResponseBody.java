// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CopyFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <br>
     * <p>If a file is copied, this parameter is not returned. If a folder is copied, the folder is asynchronously copied in the background and this parameter is returned. You can call the GetAsyncTask operation to query the information about the asynchronous task based on the task ID.</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the copied file or folder.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static CopyFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyFileResponseBody self = new CopyFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyFileResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public CopyFileResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CopyFileResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CopyFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
