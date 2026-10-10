// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceGroupSourceFileRequest extends TeaModel {
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
