// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileRequest extends TeaModel {
    /**
     * <p>文件 MIME 类型（可选，不传时按 application/octet-stream 处理）</p>
     * 
     * <strong>example:</strong>
     * <p>application/pdf</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>原始文件名（含后缀，如 report.pdf）。中转生成的 OSS 地址不携带原始文件名，后端据此确定文件后缀与展示名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>report.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>文件的 OSS 地址。使用 SDK 的 UploadChatFileAdvance 方法时由 SDK 中转上传后自动回填；直接调用本 API 时需自行传入可被服务端访问的 OSS 地址</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-08-06/9f8c2a1b">http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-08-06/9f8c2a1b</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>Agent 命名空间标识</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UploadChatFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadChatFileRequest self = new UploadChatFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadChatFileRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadChatFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadChatFileRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public UploadChatFileRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public UploadChatFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
