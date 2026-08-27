// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class OfflineAnnouncementResponseBody extends TeaModel {
    /**
     * <p>The business ID of the announcement.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("announcementId")
    public Long announcementId;

    /**
     * <p>Indicates whether the status was changed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("changed")
    public Boolean changed;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T14:00:00+08:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The datasource status after re-parsing.</p>
     * 
     * <strong>example:</strong>
     * <p>OFFLINE</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The user who performed the update.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("updatedBy")
    public Long updatedBy;

    public static OfflineAnnouncementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineAnnouncementResponseBody self = new OfflineAnnouncementResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineAnnouncementResponseBody setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
        return this;
    }
    public Long getAnnouncementId() {
        return this.announcementId;
    }

    public OfflineAnnouncementResponseBody setChanged(Boolean changed) {
        this.changed = changed;
        return this;
    }
    public Boolean getChanged() {
        return this.changed;
    }

    public OfflineAnnouncementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OfflineAnnouncementResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public OfflineAnnouncementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OfflineAnnouncementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OfflineAnnouncementResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OfflineAnnouncementResponseBody setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

}
