// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateAnnouncementResponseBody extends TeaModel {
    /**
     * <p>The business ID of the notice.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("announcementId")
    public Long announcementId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("createdBy")
    public Long createdBy;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The publish time in ISO 8601 format. This field is empty for drafts.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-20T14:00:00+08:00</p>
     */
    @NameInMap("publishedAt")
    public String publishedAt;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The source type of the dictionary file. Valid values: OSS: Object Storage Service (OSS). ORIGIN: retains the previously uploaded dictionary.</p>
     * 
     * <strong>example:</strong>
     * <p>PLATFORM</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The refund status. You need to query and confirm the refund status during the refund process. Valid values:</p>
     * <ul>
     * <li>SUCCESS: All succeeded.</li>
     * <li>FAIL: Failed.</li>
     * <li>WAIT_PAY: Waiting for refund.</li>
     * <li>EXPIRE: Expired.</li>
     * <li>PAYING: Refund in progress.</li>
     * <li>TERMINATE: Refund terminated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("status")
    public String status;

    public static CreateAnnouncementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnouncementResponseBody self = new CreateAnnouncementResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAnnouncementResponseBody setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
        return this;
    }
    public Long getAnnouncementId() {
        return this.announcementId;
    }

    public CreateAnnouncementResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAnnouncementResponseBody setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public Long getCreatedBy() {
        return this.createdBy;
    }

    public CreateAnnouncementResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAnnouncementResponseBody setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }
    public String getPublishedAt() {
        return this.publishedAt;
    }

    public CreateAnnouncementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAnnouncementResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateAnnouncementResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
