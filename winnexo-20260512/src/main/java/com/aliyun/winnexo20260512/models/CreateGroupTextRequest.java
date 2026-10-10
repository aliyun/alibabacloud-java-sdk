// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupTextRequest extends TeaModel {
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
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_example</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectResources</p>
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
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The message content for text messages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("textContent")
    public String textContent;

    public static CreateGroupTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupTextRequest self = new CreateGroupTextRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupTextRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupTextRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupTextRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupTextRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupTextRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupTextRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateGroupTextRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

}
