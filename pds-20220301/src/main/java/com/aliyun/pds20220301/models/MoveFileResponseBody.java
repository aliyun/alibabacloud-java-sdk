// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class MoveFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * <p>If an empty string is returned, the file is moved.</p>
     * <p>If a non-empty string is returned, an asynchronous task is required. You can call the GetAsyncTask operation to obtain the information about an asynchronous task based on the task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23ebd1a24dba4166b1527add476ef2866051b4d5del106</p>
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
     * <p>Indicates whether the file already exists in the destination directory.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("exist")
    public Boolean exist;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fileid1</p>
     */
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
