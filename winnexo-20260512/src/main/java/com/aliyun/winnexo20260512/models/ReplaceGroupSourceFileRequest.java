// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ReplaceGroupSourceFileRequest extends TeaModel {
    /**
     * <p>新文件名；省略或空字符串保留原文件名，用户自定义展示名沿用现有保护规则</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>已上传新文件的 OSS 持久化地址，使用上传接口返回值</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example/new.txt</p>
     */
    @NameInMap("filePath")
    public String filePath;

    /**
     * <p>已上传新文件的访问 URL，可能携带临时签名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/new.txt">https://example.com/new.txt</a></p>
     */
    @NameInMap("filePublicUrl")
    public String filePublicUrl;

    /**
     * <p>已上传新文件的文件记录 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file_example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>是否等待解析完成；默认 false 异步受理，true 同步等待，网关超时 300000ms</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("forceSync")
    public Boolean forceSync;

    /**
     * <p>资料所属协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>当前空间物理 GROUP 资料 ID；引用资料只读</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>source_example</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
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
