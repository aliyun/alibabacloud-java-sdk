// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

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
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The list of resource tag JSON strings applied to all child sources created during knowledge base synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Key&quot;,&quot;KnowledgeBase&quot;]</p>
     */
    @NameInMap("sourceTags")
    public String sourceTags;

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

    public CreatePersonalAlidingKnowledgeBaseRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public CreatePersonalAlidingKnowledgeBaseRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public CreatePersonalAlidingKnowledgeBaseRequest setSourceTags(String sourceTags) {
        this.sourceTags = sourceTags;
        return this;
    }
    public String getSourceTags() {
        return this.sourceTags;
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
         * <p>The cron expression for the timed scheduling node.</p>
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
