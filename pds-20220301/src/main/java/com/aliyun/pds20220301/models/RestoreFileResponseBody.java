// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RestoreFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <p>If an empty string is returned, the file or folder is restored.</p>
     * <p>If a non-empty string is returned, an asynchronous task is required. You can call the GetAsyncTask operation to obtain the information about an asynchronous task based on the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
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
     * <p>The ID of the file or folder.</p>
     * 
     * <strong>example:</strong>
     * <p>4221bf6e6ab43a255edc4463bffa6f5f5d317401</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static RestoreFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreFileResponseBody self = new RestoreFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreFileResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public RestoreFileResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public RestoreFileResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public RestoreFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
