// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationResponseBody extends TeaModel {
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
     * <p>The default executor defined in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("defaultExecutor")
    public UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor;

    /**
     * <p>The default model profile defined in the template.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("defaultModel")
    public String defaultModel;

    /**
     * <p>The list of user IDs for the default owners defined in the template.</p>
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
    public UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor;

    /**
     * <p>The currently effective model profile.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max-plus</p>
     */
    @NameInMap("effectiveModel")
    public String effectiveModel;

    /**
     * <p>The list of user IDs for the currently effective owners.</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("effectiveResponsibleUserIds")
    public java.util.List<String> effectiveResponsibleUserIds;

    /**
     * <p>The ID of the current physical plan.</p>
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
     * <p>The key of the business node.</p>
     * 
     * <strong>example:</strong>
     * <p>node_7f3a2c</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>The instance override values. If a field is null, the default value defined in the template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
     */
    @NameInMap("overrides")
    public UpdateWorkflowNodeConfigurationResponseBodyOverrides overrides;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The state refresh cursor. This value cannot be used as the configuration version.</p>
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

    public static UpdateWorkflowNodeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowNodeConfigurationResponseBody self = new UpdateWorkflowNodeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowNodeConfigurationResponseBody setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    public Boolean getCanEdit() {
        return this.canEdit;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setConfigVersion(Long configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public Long getConfigVersion() {
        return this.configVersion;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setDefaultExecutor(UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor) {
        this.defaultExecutor = defaultExecutor;
        return this;
    }
    public UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor getDefaultExecutor() {
        return this.defaultExecutor;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setDefaultModel(String defaultModel) {
        this.defaultModel = defaultModel;
        return this;
    }
    public String getDefaultModel() {
        return this.defaultModel;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setDefaultResponsibleUserIds(java.util.List<String> defaultResponsibleUserIds) {
        this.defaultResponsibleUserIds = defaultResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getDefaultResponsibleUserIds() {
        return this.defaultResponsibleUserIds;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setEffectiveExecutor(UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor) {
        this.effectiveExecutor = effectiveExecutor;
        return this;
    }
    public UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor getEffectiveExecutor() {
        return this.effectiveExecutor;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setEffectiveModel(String effectiveModel) {
        this.effectiveModel = effectiveModel;
        return this;
    }
    public String getEffectiveModel() {
        return this.effectiveModel;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setEffectiveResponsibleUserIds(java.util.List<String> effectiveResponsibleUserIds) {
        this.effectiveResponsibleUserIds = effectiveResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getEffectiveResponsibleUserIds() {
        return this.effectiveResponsibleUserIds;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setOverrides(UpdateWorkflowNodeConfigurationResponseBodyOverrides overrides) {
        this.overrides = overrides;
        return this;
    }
    public UpdateWorkflowNodeConfigurationResponseBodyOverrides getOverrides() {
        return this.overrides;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateWorkflowNodeConfigurationResponseBody setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public static class UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor extends TeaModel {
        /**
         * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor self = new UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor extends TeaModel {
        /**
         * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor self = new UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor extends TeaModel {
        /**
         * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor self = new UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateWorkflowNodeConfigurationResponseBodyOverrides extends TeaModel {
        /**
         * <p>The overridden executor. A value of null indicates that the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        @NameInMap("executor")
        public UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor executor;

        /**
         * <p>The overridden model profile. A value of null indicates that the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The list of overridden owner IDs. A value of null indicates that the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        @NameInMap("responsibleUserIds")
        public java.util.List<Long> responsibleUserIds;

        public static UpdateWorkflowNodeConfigurationResponseBodyOverrides build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkflowNodeConfigurationResponseBodyOverrides self = new UpdateWorkflowNodeConfigurationResponseBodyOverrides();
            return TeaModel.build(map, self);
        }

        public UpdateWorkflowNodeConfigurationResponseBodyOverrides setExecutor(UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor executor) {
            this.executor = executor;
            return this;
        }
        public UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor getExecutor() {
            return this.executor;
        }

        public UpdateWorkflowNodeConfigurationResponseBodyOverrides setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateWorkflowNodeConfigurationResponseBodyOverrides setResponsibleUserIds(java.util.List<Long> responsibleUserIds) {
            this.responsibleUserIds = responsibleUserIds;
            return this;
        }
        public java.util.List<Long> getResponsibleUserIds() {
            return this.responsibleUserIds;
        }

    }

}
