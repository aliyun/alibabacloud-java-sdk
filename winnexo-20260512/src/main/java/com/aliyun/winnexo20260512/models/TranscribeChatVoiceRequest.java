// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TranscribeChatVoiceRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The content type of the file. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: Image.</li>
     * <li><strong>document</strong>: General document.</li>
     * <li><strong>alidoc</strong>: AliDoc.</li>
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
     * <p>audio/mpeg</p>
     */
    @NameInMap("contentType")
    public String contentType;

    /**
     * <p>The standard Base64-encoded audio content, excluding the data URI prefix. This parameter and FileUrl are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>UklGRg==</p>
     */
    @NameInMap("fileContentBase64")
    public String fileContentBase64;

    /**
     * <p>The full path and name of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>meeting.mp3</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The publicly accessible URL of the attachment.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-09-08/9f8c2a1b">http://winnexo-file-transfer.oss-cn-hangzhou.aliyuncs.com/openapi/2026-09-08/9f8c2a1b</a></p>
     */
    @NameInMap("fileUrl")
    public String fileUrl;

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
     * <p>The ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static TranscribeChatVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        TranscribeChatVoiceRequest self = new TranscribeChatVoiceRequest();
        return TeaModel.build(map, self);
    }

    public TranscribeChatVoiceRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public TranscribeChatVoiceRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public TranscribeChatVoiceRequest setFileContentBase64(String fileContentBase64) {
        this.fileContentBase64 = fileContentBase64;
        return this;
    }
    public String getFileContentBase64() {
        return this.fileContentBase64;
    }

    public TranscribeChatVoiceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public TranscribeChatVoiceRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public TranscribeChatVoiceRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public TranscribeChatVoiceRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public TranscribeChatVoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
