// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewKnowledgeBaseSourceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The text content. This is used for the CONTENT type.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample content</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The file name extension. This is used for the OSS_IMM type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>The file name. This is used for the OSS_IMM type.</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The preview type. Valid values: OSS_IMM, IMAGE, AUDIO, VIDEO, HTML, DING_TALK, VOICE_MEETING, CONTENT.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS_IMM</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>The preview URL. This is used for the OSS_IMM, DING_TALK, and VOICE_MEETING types.</p>
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
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PreviewKnowledgeBaseSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewKnowledgeBaseSourceResponseBody self = new PreviewKnowledgeBaseSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewKnowledgeBaseSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PreviewKnowledgeBaseSourceResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PreviewKnowledgeBaseSourceResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public PreviewKnowledgeBaseSourceResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PreviewKnowledgeBaseSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewKnowledgeBaseSourceResponseBody setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public PreviewKnowledgeBaseSourceResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public PreviewKnowledgeBaseSourceResponseBody setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
        return this;
    }
    public String getPublicUrl() {
        return this.publicUrl;
    }

    public PreviewKnowledgeBaseSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
