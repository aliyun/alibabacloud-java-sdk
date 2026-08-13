// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class PreviewPersonalSourceResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>文本内容（CONTENT类型使用）</p>
     * 
     * <strong>example:</strong>
     * <p>示例内容</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>文件扩展名（OSS_IMM类型使用）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>文件名（OSS_IMM类型使用）</p>
     * 
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>预览类型：OSS_IMM / IMAGE / AUDIO / VIDEO / HTML / DING_TALK / VOICE_MEETING / CONTENT</p>
     * 
     * <strong>example:</strong>
     * <p>OSS_IMM</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>预览URL（OSS_IMM、DING_TALK、VOICE_MEETING使用）</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("previewUrl")
    public String previewUrl;

    /**
     * <p>公开下载URL（可供下载的文件URL）</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("publicUrl")
    public String publicUrl;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static PreviewPersonalSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewPersonalSourceResponseBody self = new PreviewPersonalSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewPersonalSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PreviewPersonalSourceResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PreviewPersonalSourceResponseBody setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public PreviewPersonalSourceResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public PreviewPersonalSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewPersonalSourceResponseBody setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public PreviewPersonalSourceResponseBody setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public PreviewPersonalSourceResponseBody setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
        return this;
    }
    public String getPublicUrl() {
        return this.publicUrl;
    }

    public PreviewPersonalSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
