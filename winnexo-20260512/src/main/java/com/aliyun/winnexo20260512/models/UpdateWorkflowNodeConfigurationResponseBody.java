// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateWorkflowNodeConfigurationResponseBody extends TeaModel {
    /**
     * <p>当前用户是否可编辑此节点</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canEdit")
    public Boolean canEdit;

    /**
     * <p>公共业务状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>配置版本；更新或恢复时作为expectedVersion</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("configVersion")
    public Long configVersion;

    /**
     * <p>模板默认执行主体</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("defaultExecutor")
    public UpdateWorkflowNodeConfigurationResponseBodyDefaultExecutor defaultExecutor;

    /**
     * <p>模板默认模型运行档</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("defaultModel")
    public String defaultModel;

    /**
     * <p>模板默认负责人用户ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("defaultResponsibleUserIds")
    public java.util.List<String> defaultResponsibleUserIds;

    /**
     * <p>当前生效的执行主体</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
     */
    @NameInMap("effectiveExecutor")
    public UpdateWorkflowNodeConfigurationResponseBodyEffectiveExecutor effectiveExecutor;

    /**
     * <p>当前生效的模型运行档</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max-plus</p>
     */
    @NameInMap("effectiveModel")
    public String effectiveModel;

    /**
     * <p>当前生效的负责人用户ID列表</p>
     * 
     * <strong>example:</strong>
     * <p>[10001]</p>
     */
    @NameInMap("effectiveResponsibleUserIds")
    public java.util.List<String> effectiveResponsibleUserIds;

    /**
     * <p>当前物理计划ID</p>
     * 
     * <strong>example:</strong>
     * <p>inst_2081</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>公共错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>业务节点key</p>
     * 
     * <strong>example:</strong>
     * <p>node_7f3a2c</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>实例覆盖值；字段为null时使用模板默认值</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
     */
    @NameInMap("overrides")
    public UpdateWorkflowNodeConfigurationResponseBodyOverrides overrides;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>状态刷新游标，不能作为配置版本</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    /**
     * <p>最后配置更新时间ISO8601；从未更新时为空</p>
     * 
     * <strong>example:</strong>
     * <p>2026-11-05T08:00:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>最后更新配置的平台用户ID；从未更新时为空</p>
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
         * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
         * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
         * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
         * 
         * <strong>example:</strong>
         * <p>agent_1001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
         * <p>覆盖执行主体；null为默认</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        @NameInMap("executor")
        public UpdateWorkflowNodeConfigurationResponseBodyOverridesExecutor executor;

        /**
         * <p>覆盖模型运行档；null为默认</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>覆盖负责人ID列表；null为默认</p>
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
