// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileDownloadCallbackInfo extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bucket")
    public String bucket;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static FileDownloadCallbackInfo build(java.util.Map<String, ?> map) throws Exception {
        FileDownloadCallbackInfo self = new FileDownloadCallbackInfo();
        return TeaModel.build(map, self);
    }

    public FileDownloadCallbackInfo setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public FileDownloadCallbackInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public FileDownloadCallbackInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public FileDownloadCallbackInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public FileDownloadCallbackInfo setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public FileDownloadCallbackInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
