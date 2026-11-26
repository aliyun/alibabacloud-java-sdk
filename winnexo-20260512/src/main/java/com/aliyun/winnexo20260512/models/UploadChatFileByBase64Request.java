// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileByBase64Request extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

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
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

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

    public UploadChatFileByBase64Request setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public UploadChatFileByBase64Request setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public UploadChatFileByBase64Request setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public UploadChatFileByBase64Request setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
