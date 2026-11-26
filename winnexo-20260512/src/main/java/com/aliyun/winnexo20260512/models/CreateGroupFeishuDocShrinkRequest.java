// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuDocShrinkRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is performed as the user identified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The description of the AI assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>Group collaboration document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The directory ID.</p>
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
     * <p>The mirror name.</p>
     * 
     * <strong>example:</strong>
     * <p>Project plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The meeting notes content. This parameter is optional and is used for auxiliary analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>Extract decisions and to-dos</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public String objectBindingsShrink;

    /**
     * <p>The name of the operation object.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The resource tags. This parameter is optional and accepts a JSON string list, such as [&quot;tagA&quot;,&quot;tagB&quot;].</p>
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
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, this parameter is explicitly passed by using the --tenant-id option.</p>
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

    public CreateGroupFeishuDocShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public CreateGroupFeishuDocShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreateGroupFeishuDocShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
