// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetCollaborationGroupOutputItemPreviewResponseBody extends TeaModel {
    /**
     * <p>公共业务状态码，由后端Code字段映射；错误时用于识别失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>ERR.Robject.Auth.TenantAccessDenied</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>可直接展示的文本正文或预览提示；不提供正文的文件类型可为空。</p>
     * 
     * <strong>example:</strong>
     * <h1>技术方案</h1>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>是否降级为下载。true时应展示下载入口，不要按在线文档预览器处理。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("degraded")
    public Boolean degraded;

    /**
     * <p>短期签名下载地址；普通文件有效期3600秒，邮件正文可为空。过期后重新调用本接口。示例仅展示URL格式，不包含真实签名。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/download/document.md">https://example.com/download/document.md</a></p>
     */
    @NameInMap("downloadUrl")
    public String downloadUrl;

    /**
     * <p>文件扩展名，不含点；无扩展名时可为空。</p>
     * 
     * <strong>example:</strong>
     * <p>md</p>
     */
    @NameInMap("fileExt")
    public String fileExt;

    /**
     * <p>文件名，包含扩展名；无文件名时可为空。</p>
     * 
     * <strong>example:</strong>
     * <p>codex-r2-a-baseline.md</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>对话生成文件的产出明细ID。取GetNodeDetail返回的artifacts中ref.kind为USER_OUTPUT_ITEM的ref.id；不是artifactId。</p>
     * 
     * <strong>example:</strong>
     * <p>51469466</p>
     */
    @NameInMap("itemId")
    public String itemId;

    /**
     * <p>公共错误说明，由后端Message字段映射；错误时描述失败原因。</p>
     * 
     * <strong>example:</strong>
     * <p>无权访问租户 2147483647，用户不属于该租户</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>预览方式，例如CONTENT为文本正文，HTML为网页，IMAGE为图片，AUDIO为音频，VIDEO为视频，OSS_IMM为文档预览。</p>
     * 
     * <strong>example:</strong>
     * <p>CONTENT</p>
     */
    @NameInMap("previewType")
    public String previewType;

    /**
     * <p>短期预览地址；正文可直接展示时可为空。地址过期后重新调用本接口。示例仅展示URL格式，不是可访问凭证。</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/preview/document">https://example.com/preview/document</a></p>
     */
    @NameInMap("previewUrl")
    public String previewUrl;

    /**
     * <p>请求追踪ID，由后端RequestId字段映射，用于排查调用失败。</p>
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
