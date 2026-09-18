// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewGroupSourceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The text content. This field is used for the CONTENT preview type.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Indicates whether the preview is degraded to a download, meaning the resource cannot be opened in the online previewer. Valid values:</p>
     * <ul>
     * <li>true: The preview is degraded to a download.</li>
     * <li>false: The resource can be previewed online.</li>
     * </ul>
     */
    @NameInMap("degraded")
    public Boolean degraded;

    /**
     * <p>The file name extension. This field is used for the OSS_IMM preview type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>The file name. This field is used for the OSS_IMM preview type.</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The preview type. Valid values: OSS_IMM, IMAGE, AUDIO, VIDEO, HTML, DING_TALK, VOICE_MEETING, and CONTENT.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS_IMM</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>The preview URL. This field is used for the OSS_IMM, DING_TALK, and VOICE_MEETING preview types.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("previewUrl")
    public String previewUrl;

    /**
     * <p>The public download URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("publicUrl")
    public String publicUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E68654BD-F7BA-5837-8686-5645D739A47C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PreviewGroupSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewGroupSourceResponseBody self = new PreviewGroupSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewGroupSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PreviewGroupSourceResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PreviewGroupSourceResponseBody setDegraded(Boolean degraded) {
        this.degraded = degraded;
        return this;
    }
    public Boolean getDegraded() {
        return this.degraded;
    }

    public PreviewGroupSourceResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public PreviewGroupSourceResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PreviewGroupSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewGroupSourceResponseBody setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public PreviewGroupSourceResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public PreviewGroupSourceResponseBody setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
        return this;
    }
    public String getPublicUrl() {
        return this.publicUrl;
    }

    public PreviewGroupSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
