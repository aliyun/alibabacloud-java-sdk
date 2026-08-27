// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuDocRequest extends TeaModel {
    /**
     * <p>The pipeline description.</p>
     * 
     * <strong>example:</strong>
     * <p>Project design document</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dir_personal_child</p>
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
     * <p>The updated name of the filter view.</p>
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
     * <p>Extract decisions and to-dos</p>
     */
    @NameInMap("notes")
    public String notes;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<CreatePersonalFeishuDocRequestObjectBindings> objectBindings;

    /**
     * <p>The digital employee name (operating object name, optional).</p>
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
    public CreatePersonalFeishuDocRequestSyncConfig syncConfig;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalFeishuDocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuDocRequest self = new CreatePersonalFeishuDocRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuDocRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFeishuDocRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuDocRequest setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public CreatePersonalFeishuDocRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalFeishuDocRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public CreatePersonalFeishuDocRequest setObjectBindings(java.util.List<CreatePersonalFeishuDocRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<CreatePersonalFeishuDocRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public CreatePersonalFeishuDocRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFeishuDocRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
    }

    public CreatePersonalFeishuDocRequest setSyncConfig(CreatePersonalFeishuDocRequestSyncConfig syncConfig) {
        this.syncConfig = syncConfig;
        return this;
    }
    public CreatePersonalFeishuDocRequestSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    public CreatePersonalFeishuDocRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class CreatePersonalFeishuDocRequestObjectBindings extends TeaModel {
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

        public static CreatePersonalFeishuDocRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalFeishuDocRequestObjectBindings self = new CreatePersonalFeishuDocRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public CreatePersonalFeishuDocRequestObjectBindings setGraphName(String graphName) {
            this.graphName = graphName;
            return this;
        }
        public String getGraphName() {
            return this.graphName;
        }

        public CreatePersonalFeishuDocRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreatePersonalFeishuDocRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class CreatePersonalFeishuDocRequestSyncConfig extends TeaModel {
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
         * <p>The synchronization preset: hourly or daily_2am.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("preset")
        public String preset;

        public static CreatePersonalFeishuDocRequestSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalFeishuDocRequestSyncConfig self = new CreatePersonalFeishuDocRequestSyncConfig();
            return TeaModel.build(map, self);
        }

        public CreatePersonalFeishuDocRequestSyncConfig setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreatePersonalFeishuDocRequestSyncConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreatePersonalFeishuDocRequestSyncConfig setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

    }

}
