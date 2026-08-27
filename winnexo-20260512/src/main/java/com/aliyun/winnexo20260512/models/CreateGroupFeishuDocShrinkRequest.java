// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuDocShrinkRequest extends TeaModel {
    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>Group collaboration document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_group_child</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The document URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.feishu.cn/docx/doxcnExample">https://example.feishu.cn/docx/doxcnExample</a></p>
     */
    @NameInMap("docUrl")
    public String docUrl;

    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_delivery</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>Project Plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes content (optional). The notes are used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract decisions and to-do items</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The name of the operating object.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The resource tags (optional, a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;R&amp;D&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The synchronization settings.</p>
     */
    @NameInMap("syncConfig")
    public String syncConfigShrink;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateGroupFeishuDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuDocShrinkRequest self = new CreateGroupFeishuDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuDocShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupFeishuDocShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFeishuDocShrinkRequest setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public CreateGroupFeishuDocShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFeishuDocShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupFeishuDocShrinkRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateGroupFeishuDocShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public CreateGroupFeishuDocShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateGroupFeishuDocShrinkRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupFeishuDocShrinkRequest setSyncConfigShrink(String syncConfigShrink) {
        this.syncConfigShrink = syncConfigShrink;
        return this;
    }
    public String getSyncConfigShrink() {
        return this.syncConfigShrink;
    }

    public CreateGroupFeishuDocShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
