// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetCollaborationGroupOutputItemPreviewResponseBody extends TeaModel {
    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERR.Robject.Auth.TenantAccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The text content or preview prompt. This field can be empty.</p>
     * 
     * <strong>example:</strong>
     * <h1>Technical solution</h1>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Indicates whether the preview is downgraded to a download preview.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("degraded")
    public Boolean degraded;

    /**
     * <p>The short-term signed download URL. This field can be empty. If the URL expires, call this operation again.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/download/document.md">https://example.com/download/document.md</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>The file name extension. This field can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>md</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>The file name. This field can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>codex-r2-a-baseline.md</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The output detail ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51469466</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>Access denied to tenant 2147483647 because the user does not belong to the tenant</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The preview type.</p>
     * 
     * <strong>example:</strong>
     * <p>CONTENT</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>The short-term preview URL. This field can be empty.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
     */
    @NameInMap("previewUrl")
    public String previewUrl;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c9cf6cb3-3f5c-4994-a8a1-c93379a6f5cf</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCollaborationGroupOutputItemPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCollaborationGroupOutputItemPreviewResponseBody self = new GetCollaborationGroupOutputItemPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public GetCollaborationGroupOutputItemPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
