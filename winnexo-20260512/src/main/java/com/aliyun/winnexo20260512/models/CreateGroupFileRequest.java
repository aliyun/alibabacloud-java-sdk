// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFileRequest extends TeaModel {
    /**
     * <p>资料描述</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>当前空间物理目录ID；省略/root使用空间根，首次可能初始化根目录；引用目录不可写</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>当前用户在当前租户上传的SOURCE/OSS文件记录ID；须先完成文件PUT</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

    /**
     * <p>协作空间 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>资料显示名；最终名称沿用Provider规则</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>项目资料</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>资料标签，JSON字符串列表</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateGroupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFileRequest self = new CreateGroupFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupFileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupFileRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFileRequest setFileRecordId(String fileRecordId) {
        this.fileRecordId = fileRecordId;
        return this;
    }
    public String getFileRecordId() {
        return this.fileRecordId;
    }

    public CreateGroupFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupFileRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupFileRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
