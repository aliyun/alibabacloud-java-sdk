// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ResetWorkflowNodeConfigurationResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the current user can edit this node.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canEdit")
    public Boolean canEdit;

    /**
     * <p>The common business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The configuration version. Use this value as the expectedVersion when updating or restoring.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("configVersion")
    public Long configVersion;

    /**
     * <p>The default executor of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("defaultExecutor")
    public ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor;

    /**
     * <p>The default model runtime profile of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("defaultModel")
    public String defaultModel;

    /**
     * <p>The list of user IDs for the default responsible users of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("defaultResponsibleUserIds")
    public java.util.List<String> defaultResponsibleUserIds;

    /**
     * <p>The currently effective executor.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("effectiveExecutor")
    public ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor;

    /**
     * <p>The currently effective model runtime profile.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max-plus</p>
     */
    @NameInMap("effectiveModel")
    public String effectiveModel;

    /**
     * <p>The list of user IDs for the currently effective responsible users.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("effectiveResponsibleUserIds")
    public java.util.List<String> effectiveResponsibleUserIds;

    /**
     * <p>The current physical plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>inst_2081</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The common error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The business node key.</p>
     * 
     * <strong>example:</strong>
     * <p>node_7f3a2c</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>The instance override values. If a field is null, the default value from the template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
     */
    @NameInMap("overrides")
    public ResetWorkflowNodeConfigurationResponseBodyOverrides overrides;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The state refresh cursor. This cannot be used as a configuration version.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    /**
     * <p>The time when the configuration was last updated, in ISO 8601 format. This field is empty if the configuration has never been updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T08:00:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>The platform user ID of the user who last updated the configuration. This field is empty if the configuration has never been updated.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("updatedBy")
    public Long updatedBy;

    public static ResetWorkflowNodeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetWorkflowNodeConfigurationResponseBody self = new ResetWorkflowNodeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetWorkflowNodeConfigurationResponseBody setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    public Boolean getCanEdit() {
        return this.canEdit;
    }

    public ResetWorkflowNodeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetWorkflowNodeConfigurationResponseBody setConfigVersion(Long configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public Long getConfigVersion() {
        return this.configVersion;
    }

    public ResetWorkflowNodeConfigurationResponseBody setDefaultExecutor(ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor) {
        this.defaultExecutor = defaultExecutor;
        return this;
    }
    public ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor getDefaultExecutor() {
        return this.defaultExecutor;
    }

    public ResetWorkflowNodeConfigurationResponseBody setDefaultModel(String defaultModel) {
        this.defaultModel = defaultModel;
        return this;
    }
    public String getDefaultModel() {
        return this.defaultModel;
    }

    public ResetWorkflowNodeConfigurationResponseBody setDefaultResponsibleUserIds(java.util.List<String> defaultResponsibleUserIds) {
        this.defaultResponsibleUserIds = defaultResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getDefaultResponsibleUserIds() {
        return this.defaultResponsibleUserIds;
    }

    public ResetWorkflowNodeConfigurationResponseBody setEffectiveExecutor(ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor) {
        this.effectiveExecutor = effectiveExecutor;
        return this;
    }
    public ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor getEffectiveExecutor() {
        return this.effectiveExecutor;
    }

    public ResetWorkflowNodeConfigurationResponseBody setEffectiveModel(String effectiveModel) {
        this.effectiveModel = effectiveModel;
        return this;
    }
    public String getEffectiveModel() {
        return this.effectiveModel;
    }

    public ResetWorkflowNodeConfigurationResponseBody setEffectiveResponsibleUserIds(java.util.List<String> effectiveResponsibleUserIds) {
        this.effectiveResponsibleUserIds = effectiveResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getEffectiveResponsibleUserIds() {
        return this.effectiveResponsibleUserIds;
    }

    public ResetWorkflowNodeConfigurationResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetWorkflowNodeConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetWorkflowNodeConfigurationResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ResetWorkflowNodeConfigurationResponseBody setOverrides(ResetWorkflowNodeConfigurationResponseBodyOverrides overrides) {
        this.overrides = overrides;
        return this;
    }
    public ResetWorkflowNodeConfigurationResponseBodyOverrides getOverrides() {
        return this.overrides;
    }

    public ResetWorkflowNodeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetWorkflowNodeConfigurationResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public ResetWorkflowNodeConfigurationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ResetWorkflowNodeConfigurationResponseBody setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public static class ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor extends TeaModel {
        /**
         * <p>The executor ID. For USER, this is a positive integer string representing the platform user ID. For AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER for a real user, AGENT for a digital employee, or SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor build(java.util.Map<String, ?> map) throws Exception {
            ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor self = new ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor();
            return TeaModel.build(map, self);
        }

        public ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ResetWorkflowNodeConfigurationResponseBodyDefaultExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor extends TeaModel {
        /**
         * <p>The executor ID. For USER, this is a positive integer string representing the platform user ID. For AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER for a real user, AGENT for a digital employee, or SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor build(java.util.Map<String, ?> map) throws Exception {
            ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor self = new ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor();
            return TeaModel.build(map, self);
        }

        public ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ResetWorkflowNodeConfigurationResponseBodyEffectiveExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor extends TeaModel {
        /**
         * <p>The executor ID. For USER, this is a positive integer string representing the platform user ID. For AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER for a real user, AGENT for a digital employee, or SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor build(java.util.Map<String, ?> map) throws Exception {
            ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor self = new ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor();
            return TeaModel.build(map, self);
        }

        public ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ResetWorkflowNodeConfigurationResponseBodyOverrides extends TeaModel {
        /**
         * <p>The overridden executor. A null value indicates the default.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        @NameInMap("executor")
        public ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor executor;

        /**
         * <p>The overridden model runtime profile. A null value indicates the default.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The list of overridden responsible user IDs. A null value indicates the default.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        @NameInMap("responsibleUserIds")
        public java.util.List<Long> responsibleUserIds;

        public static ResetWorkflowNodeConfigurationResponseBodyOverrides build(java.util.Map<String, ?> map) throws Exception {
            ResetWorkflowNodeConfigurationResponseBodyOverrides self = new ResetWorkflowNodeConfigurationResponseBodyOverrides();
            return TeaModel.build(map, self);
        }

        public ResetWorkflowNodeConfigurationResponseBodyOverrides setExecutor(ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor executor) {
            this.executor = executor;
            return this;
        }
        public ResetWorkflowNodeConfigurationResponseBodyOverridesExecutor getExecutor() {
            return this.executor;
        }

        public ResetWorkflowNodeConfigurationResponseBodyOverrides setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ResetWorkflowNodeConfigurationResponseBodyOverrides setResponsibleUserIds(java.util.List<Long> responsibleUserIds) {
            this.responsibleUserIds = responsibleUserIds;
            return this;
        }
        public java.util.List<Long> getResponsibleUserIds() {
            return this.responsibleUserIds;
        }

    }

}
