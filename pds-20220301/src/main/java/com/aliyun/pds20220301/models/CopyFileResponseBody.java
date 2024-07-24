// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CopyFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <p>If a file is copied, this parameter is not returned. If a folder is copied, the folder is asynchronously copied in the background and this parameter is returned. You can call the GetAsyncTask operation to query the information about the asynchronous task based on the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
     */
    @NameInMap("async_task_id")
    public String asyncTaskId;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The ID of the copied file or folder.</p>
     * 
     * <strong>example:</strong>
     * <p>4221bf6e6ab43a255edc4463bffa6f5f5d317401</p>
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
