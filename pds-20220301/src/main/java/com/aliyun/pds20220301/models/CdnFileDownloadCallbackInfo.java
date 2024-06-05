// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CdnFileDownloadCallbackInfo extends TeaModel {
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
    @NameInMap("expire")
    public Long expire;

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
    @NameInMap("token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static CdnFileDownloadCallbackInfo build(java.util.Map<String, ?> map) throws Exception {
        CdnFileDownloadCallbackInfo self = new CdnFileDownloadCallbackInfo();
        return TeaModel.build(map, self);
    }

    public CdnFileDownloadCallbackInfo setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CdnFileDownloadCallbackInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CdnFileDownloadCallbackInfo setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CdnFileDownloadCallbackInfo setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public CdnFileDownloadCallbackInfo setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CdnFileDownloadCallbackInfo setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CdnFileDownloadCallbackInfo setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CdnFileDownloadCallbackInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
