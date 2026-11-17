// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetWorkflowNodeConfigurationResponseBody extends TeaModel {
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
     * <p>The configuration version. It is used as the expectedVersion when updating or restoring the configuration.</p>
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
    public GetWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor;

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
    public GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor;

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
     * <p>The override values for the instance. If a field is null, the default value of the template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
     */
    @NameInMap("overrides")
    public GetWorkflowNodeConfigurationResponseBodyOverrides overrides;

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

    public static GetWorkflowNodeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowNodeConfigurationResponseBody self = new GetWorkflowNodeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowNodeConfigurationResponseBody setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }
    public Boolean getCanEdit() {
        return this.canEdit;
    }

    public GetWorkflowNodeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkflowNodeConfigurationResponseBody setConfigVersion(Long configVersion) {
        this.configVersion = configVersion;
        return this;
    }
    public Long getConfigVersion() {
        return this.configVersion;
    }

    public GetWorkflowNodeConfigurationResponseBody setDefaultExecutor(GetWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor) {
        this.defaultExecutor = defaultExecutor;
        return this;
    }
    public GetWorkflowNodeConfigurationResponseBodyDefaultExecutor getDefaultExecutor() {
        return this.defaultExecutor;
    }

    public GetWorkflowNodeConfigurationResponseBody setDefaultModel(String defaultModel) {
        this.defaultModel = defaultModel;
        return this;
    }
    public String getDefaultModel() {
        return this.defaultModel;
    }

    public GetWorkflowNodeConfigurationResponseBody setDefaultResponsibleUserIds(java.util.List<String> defaultResponsibleUserIds) {
        this.defaultResponsibleUserIds = defaultResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getDefaultResponsibleUserIds() {
        return this.defaultResponsibleUserIds;
    }

    public GetWorkflowNodeConfigurationResponseBody setEffectiveExecutor(GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor) {
        this.effectiveExecutor = effectiveExecutor;
        return this;
    }
    public GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor getEffectiveExecutor() {
        return this.effectiveExecutor;
    }

    public GetWorkflowNodeConfigurationResponseBody setEffectiveModel(String effectiveModel) {
        this.effectiveModel = effectiveModel;
        return this;
    }
    public String getEffectiveModel() {
        return this.effectiveModel;
    }

    public GetWorkflowNodeConfigurationResponseBody setEffectiveResponsibleUserIds(java.util.List<String> effectiveResponsibleUserIds) {
        this.effectiveResponsibleUserIds = effectiveResponsibleUserIds;
        return this;
    }
    public java.util.List<String> getEffectiveResponsibleUserIds() {
        return this.effectiveResponsibleUserIds;
    }

    public GetWorkflowNodeConfigurationResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkflowNodeConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkflowNodeConfigurationResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetWorkflowNodeConfigurationResponseBody setOverrides(GetWorkflowNodeConfigurationResponseBodyOverrides overrides) {
        this.overrides = overrides;
        return this;
    }
    public GetWorkflowNodeConfigurationResponseBodyOverrides getOverrides() {
        return this.overrides;
    }

    public GetWorkflowNodeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowNodeConfigurationResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public GetWorkflowNodeConfigurationResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public GetWorkflowNodeConfigurationResponseBody setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public static class GetWorkflowNodeConfigurationResponseBodyDefaultExecutor extends TeaModel {
        /**
         * <p>The ID of the executor. If the type is USER, this is a positive integer string representing the platform user ID. If the type is AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the executor. Valid values: USER for a real person, AGENT for a digital employee, and SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetWorkflowNodeConfigurationResponseBodyDefaultExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowNodeConfigurationResponseBodyDefaultExecutor self = new GetWorkflowNodeConfigurationResponseBodyDefaultExecutor();
            return TeaModel.build(map, self);
        }

        public GetWorkflowNodeConfigurationResponseBodyDefaultExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkflowNodeConfigurationResponseBodyDefaultExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor extends TeaModel {
        /**
         * <p>The ID of the executor. If the type is USER, this is a positive integer string representing the platform user ID. If the type is AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the executor. Valid values: USER for a real person, AGENT for a digital employee, and SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor self = new GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor();
            return TeaModel.build(map, self);
        }

        public GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkflowNodeConfigurationResponseBodyEffectiveExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkflowNodeConfigurationResponseBodyOverridesExecutor extends TeaModel {
        /**
         * <p>The ID of the executor. If the type is USER, this is a positive integer string representing the platform user ID. If the type is AGENT, this is the technical name of the digital employee in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type of the executor. Valid values: USER for a real person, AGENT for a digital employee, and SYSTEM for a legacy system executor. The SYSTEM value is used only in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetWorkflowNodeConfigurationResponseBodyOverridesExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowNodeConfigurationResponseBodyOverridesExecutor self = new GetWorkflowNodeConfigurationResponseBodyOverridesExecutor();
            return TeaModel.build(map, self);
        }

        public GetWorkflowNodeConfigurationResponseBodyOverridesExecutor setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkflowNodeConfigurationResponseBodyOverridesExecutor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetWorkflowNodeConfigurationResponseBodyOverrides extends TeaModel {
        /**
         * <p>The override executor. A null value indicates that the default is used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        @NameInMap("executor")
        public GetWorkflowNodeConfigurationResponseBodyOverridesExecutor executor;

        /**
         * <p>The override model runtime profile. A null value indicates that the default is used.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The list of override responsible user IDs. A null value indicates that the default is used.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        @NameInMap("responsibleUserIds")
        public java.util.List<Long> responsibleUserIds;

        public static GetWorkflowNodeConfigurationResponseBodyOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowNodeConfigurationResponseBodyOverrides self = new GetWorkflowNodeConfigurationResponseBodyOverrides();
            return TeaModel.build(map, self);
        }

        public GetWorkflowNodeConfigurationResponseBodyOverrides setExecutor(GetWorkflowNodeConfigurationResponseBodyOverridesExecutor executor) {
            this.executor = executor;
            return this;
        }
        public GetWorkflowNodeConfigurationResponseBodyOverridesExecutor getExecutor() {
            return this.executor;
        }

        public GetWorkflowNodeConfigurationResponseBodyOverrides setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetWorkflowNodeConfigurationResponseBodyOverrides setResponsibleUserIds(java.util.List<Long> responsibleUserIds) {
            this.responsibleUserIds = responsibleUserIds;
            return this;
        }
        public java.util.List<Long> getResponsibleUserIds() {
            return this.responsibleUserIds;
        }

    }

}
