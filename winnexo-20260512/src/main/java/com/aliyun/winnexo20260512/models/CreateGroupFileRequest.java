// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFileRequest extends TeaModel {
    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The file record ID. This parameter is optional and corresponds to settings.file_record_id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("fileRecordId")
    public String fileRecordId;

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
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Project Files</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The source tags.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The tenant ID.</p>
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
