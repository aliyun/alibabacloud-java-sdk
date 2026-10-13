// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TrashFileResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     * <p>An empty string indicates that the operation completed synchronously.</p>
     * <p>A non-empty string indicates that the operation is asynchronous. Call the GetAsyncTask operation with this ID to query the task status.</p>
     * 
     * <strong>example:</strong>
     * <p>13ebd3a24dba4166b1527add676ef2866051b4d5dele16</p>
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
     * <p>The file or folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
     */
    @NameInMap("file_id")
    public String fileId;

    public static TrashFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrashFileResponseBody self = new TrashFileResponseBody();
        return TeaModel.build(map, self);
    }

    public TrashFileResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public TrashFileResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public TrashFileResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public TrashFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
