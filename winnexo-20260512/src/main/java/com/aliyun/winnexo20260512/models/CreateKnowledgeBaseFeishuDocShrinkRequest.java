// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseFeishuDocShrinkRequest extends TeaModel {
    /**
     * <p>The description of the alias.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise policy document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_tenant_kb_child</p>
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
     * <p>The mirror name.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise Policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes content (optional). Used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract applicable scope and key clauses</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise Knowledge Assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The resource tags (optional, a JSON string list such as [&quot;tagA&quot;,&quot;tagB&quot;]).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;policy&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

    /**
     * <p>The synchronization settings.</p>
     */
    @NameInMap("syncConfig")
    public String syncConfigShrink;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateKnowledgeBaseFeishuDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseFeishuDocShrinkRequest self = new CreateKnowledgeBaseFeishuDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setObjectBindingsShrink(String objectBindingsShrink) {
        this.objectBindingsShrink = objectBindingsShrink;
        return this;
    }
    public String getObjectBindingsShrink() {
        return this.objectBindingsShrink;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setSyncConfigShrink(String syncConfigShrink) {
        this.syncConfigShrink = syncConfigShrink;
        return this;
    }
    public String getSyncConfigShrink() {
        return this.syncConfigShrink;
    }

    public CreateKnowledgeBaseFeishuDocShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
