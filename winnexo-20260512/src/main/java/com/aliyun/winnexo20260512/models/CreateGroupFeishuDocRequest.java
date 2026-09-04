// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateGroupFeishuDocRequest extends TeaModel {
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
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>ProjectPlan</p>
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
    public java.util.List<CreateGroupFeishuDocRequestObjectBindings> objectBindings;

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
    public CreateGroupFeishuDocRequestSyncConfig syncConfig;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateGroupFeishuDocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFeishuDocRequest self = new CreateGroupFeishuDocRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupFeishuDocRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupFeishuDocRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateGroupFeishuDocRequest setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public CreateGroupFeishuDocRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupFeishuDocRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupFeishuDocRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreateGroupFeishuDocRequest setObjectBindings(java.util.List<CreateGroupFeishuDocRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<CreateGroupFeishuDocRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public CreateGroupFeishuDocRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreateGroupFeishuDocRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreateGroupFeishuDocRequest setSyncConfig(CreateGroupFeishuDocRequestSyncConfig syncConfig) {
        this.syncConfig = syncConfig;
        return this;
    }
    public CreateGroupFeishuDocRequestSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    public CreateGroupFeishuDocRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class CreateGroupFeishuDocRequestObjectBindings extends TeaModel {
        /**
         * <p>The name of the semantic graph to which the object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>crm</p>
         */
        @NameInMap("graphName")
        public String graphName;

        /**
         * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a mini-app ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The advanced field type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static CreateGroupFeishuDocRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupFeishuDocRequestObjectBindings self = new CreateGroupFeishuDocRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public CreateGroupFeishuDocRequestObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public CreateGroupFeishuDocRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreateGroupFeishuDocRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class CreateGroupFeishuDocRequestSyncConfig extends TeaModel {
        /**
         * <p>The cron expression for the timed scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 * * * *</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether to enable or disable synchronization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The preset mode (can be ignored).</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreateGroupFeishuDocRequestSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupFeishuDocRequestSyncConfig self = new CreateGroupFeishuDocRequestSyncConfig();
            return TeaModel.build(map, self);
        }

        public CreateGroupFeishuDocRequestSyncConfig setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreateGroupFeishuDocRequestSyncConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateGroupFeishuDocRequestSyncConfig setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
