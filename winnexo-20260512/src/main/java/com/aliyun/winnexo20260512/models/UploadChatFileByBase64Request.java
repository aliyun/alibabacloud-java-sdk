// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileByBase64Request extends TeaModel {
    /**
     * <p>The MIME type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>application/pdf</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The Base64-encoded string of the file content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YWJj</p>
     */
    @NameInMap("fileContentBase64")
    public String fileContentBase64;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>report.pdf</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static UploadChatFileByBase64Request build(java.util.Map<String, ?> map) throws Exception {
        UploadChatFileByBase64Request self = new UploadChatFileByBase64Request();
        return TeaModel.build(map, self);
    }

    public UploadChatFileByBase64Request setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadChatFileByBase64Request setFileContentBase64(String fileContentBase64) {
        this.fileContentBase64 = fileContentBase64;
        return this;
    }
    public String getFileContentBase64() {
        return this.fileContentBase64;
    }

    public UploadChatFileByBase64Request setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadChatFileByBase64Request setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
