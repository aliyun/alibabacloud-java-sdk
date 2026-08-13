// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalAlidingKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>目标个人目录 ID；不传时自动绑定到用户默认根目录，传入时必须是当前用户的已有个人目录（PERSONAL）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>知识库显示名称；不传时由后台从远程拉取的根节点名称回填</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("kbName")
    public String kbName;

    /**
     * <p>阿里钉知识库的可公开访问 URL</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/winnexo/resource">https://example.com/winnexo/resource</a></p>
     */
    @NameInMap("kbUrl")
    public String kbUrl;

    @NameInMap("objectBindings")
    public java.util.List<CreatePersonalAlidingKnowledgeBaseRequestObjectBindings> objectBindings;

    /**
     * <p>Agent 命名空间标识，可选</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    @NameInMap("syncConfig")
    public CreatePersonalAlidingKnowledgeBaseRequestSyncConfig syncConfig;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
         * <p>绑定对象 ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>绑定对象类型，例如 CUSTOMER / OPPORTUNITY</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
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
         * <p>cron 表达式；enabled=true 时必填，enabled=false 时忽略</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("cron")
        public String cron;

        /**
         * <p>是否启用定时同步</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
