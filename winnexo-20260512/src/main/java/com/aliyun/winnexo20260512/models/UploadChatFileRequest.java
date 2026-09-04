// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileRequest extends TeaModel {
    /**
     * <p>The content type of the file. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: Image.</li>
     * <li><strong>document</strong>: General document.</li>
     * <li><strong>alidoc</strong>: Alibaba document.</li>
     * <li><strong>text</strong>: Text.</li>
     * <li><strong>video</strong>: Video.</li>
     * <li><strong>audio</strong>: Audio.</li>
     * <li><strong>archive</strong>: Archive.</li>
     * <li><strong>app</strong>: Application.</li>
     * <li><strong>link</strong>: Shortcut.</li>
     * <li><strong>other</strong>: Other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>application/pdf</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The full path name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>report.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The Yida attachment address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-08-06/9f8c2a1b">http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-08-06/9f8c2a1b</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

    /**
     * <p>The name of the digital employee (operating object name). This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The tenant ID that takes effect.</p>
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
