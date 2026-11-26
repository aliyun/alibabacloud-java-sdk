// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceGroupSourceFileRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The new file name. This parameter is optional. If you do not specify this parameter or set it to an empty string, the original file name is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The OSS persistent storage path of the replacement file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example/new.txt</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>The OSS persistent storage path of the replacement file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/new.txt">https://example.com/new.txt</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>The file record ID of the replacement file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file_example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>Specifies whether to synchronously wait for re-parsing to complete. Default value: false, which means the task is asynchronously enqueued.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceSync")
    public Boolean forceSync;

    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

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
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ReplaceGroupSourceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceGroupSourceFileRequest self = new ReplaceGroupSourceFileRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceGroupSourceFileRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ReplaceGroupSourceFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ReplaceGroupSourceFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ReplaceGroupSourceFileRequest setFilePublicUrl(String filePublicUrl) {
        this.filePublicUrl = filePublicUrl;
        return this;
    }
    public String getFilePublicUrl() {
        return this.filePublicUrl;
    }

    public ReplaceGroupSourceFileRequest setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public ReplaceGroupSourceFileRequest setForceSync(Boolean forceSync) {
        this.forceSync = forceSync;
        return this;
    }
    public Boolean getForceSync() {
        return this.forceSync;
    }

    public ReplaceGroupSourceFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ReplaceGroupSourceFileRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ReplaceGroupSourceFileRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ReplaceGroupSourceFileRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ReplaceGroupSourceFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
