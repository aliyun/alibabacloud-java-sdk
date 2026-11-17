// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TranscribeChatVoiceRequest extends TeaModel {
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

    public TranscribeChatVoiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
