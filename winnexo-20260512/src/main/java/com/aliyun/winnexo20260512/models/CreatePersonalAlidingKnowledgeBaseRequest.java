// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The display name of the knowledge base. If not provided, the name is populated from the root node name pulled from the remote source.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("kbName")
    public String kbName;

    /**
     * <p>The publicly accessible URL of the AliDing knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("kbUrl")
    public String kbUrl;

    /**
     * <p>The object bindings.</p>
     */
    @NameInMap("objectBindings")
    public java.util.List<CreatePersonalAlidingKnowledgeBaseRequestObjectBindings> objectBindings;

    /**
     * <p>The name of the digital employee (operating object name, optional).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The synchronization settings.</p>
     */
    @NameInMap("syncConfig")
    public CreatePersonalAlidingKnowledgeBaseRequestSyncConfig syncConfig;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>PiPklI1iSRTm6VFFqlY9VzbgiEiE</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalAlidingKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalAlidingKnowledgeBaseRequest self = new CreatePersonalAlidingKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setKbName(String kbName) {
        this.kbName = kbName;
        return this;
    }
    public String getKbName() {
        return this.kbName;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setKbUrl(String kbUrl) {
        this.kbUrl = kbUrl;
        return this;
    }
    public String getKbUrl() {
        return this.kbUrl;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setObjectBindings(java.util.List<CreatePersonalAlidingKnowledgeBaseRequestObjectBindings> objectBindings) {
        this.objectBindings = objectBindings;
        return this;
    }
    public java.util.List<CreatePersonalAlidingKnowledgeBaseRequestObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setSyncConfig(CreatePersonalAlidingKnowledgeBaseRequestSyncConfig syncConfig) {
        this.syncConfig = syncConfig;
        return this;
    }
    public CreatePersonalAlidingKnowledgeBaseRequestSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public static class CreatePersonalAlidingKnowledgeBaseRequestObjectBindings extends TeaModel {
        /**
         * <p>The ID of the recommended item, which can be a <strong>feedId</strong> or a micro-application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2676</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The advanced field type.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        @NameInMap("objectType")
        public String objectType;

        public static CreatePersonalAlidingKnowledgeBaseRequestObjectBindings build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalAlidingKnowledgeBaseRequestObjectBindings self = new CreatePersonalAlidingKnowledgeBaseRequestObjectBindings();
            return TeaModel.build(map, self);
        }

        public CreatePersonalAlidingKnowledgeBaseRequestObjectBindings setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public CreatePersonalAlidingKnowledgeBaseRequestObjectBindings setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class CreatePersonalAlidingKnowledgeBaseRequestSyncConfig extends TeaModel {
        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>Specifies whether to enable synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreatePersonalAlidingKnowledgeBaseRequestSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            CreatePersonalAlidingKnowledgeBaseRequestSyncConfig self = new CreatePersonalAlidingKnowledgeBaseRequestSyncConfig();
            return TeaModel.build(map, self);
        }

        public CreatePersonalAlidingKnowledgeBaseRequestSyncConfig setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public CreatePersonalAlidingKnowledgeBaseRequestSyncConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
