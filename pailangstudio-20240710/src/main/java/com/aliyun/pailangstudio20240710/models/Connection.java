// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Connection extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CustomType")
    public String customType;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Models")
    public java.util.List<ConnectionModels> models;

    @NameInMap("ResourceMeta")
    public ConnectionResourceMeta resourceMeta;

    @NameInMap("Secrets")
    public java.util.Map<String, String> secrets;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Connection build(java.util.Map<String, ?> map) throws Exception {
        Connection self = new Connection();
        return TeaModel.build(map, self);
    }

    public Connection setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Connection setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public Connection setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public Connection setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public Connection setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public Connection setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Connection setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public Connection setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Connection setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Connection setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Connection setModels(java.util.List<ConnectionModels> models) {
        this.models = models;
        return this;
    }
    public java.util.List<ConnectionModels> getModels() {
        return this.models;
    }

    public Connection setResourceMeta(ConnectionResourceMeta resourceMeta) {
        this.resourceMeta = resourceMeta;
        return this;
    }
    public ConnectionResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public Connection setSecrets(java.util.Map<String, String> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public Connection setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ConnectionModels extends TeaModel {
        /**
         * <p>模型展示名称</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>最大上下文长度</p>
         */
        @NameInMap("MaxModelLength")
        public Integer maxModelLength;

        /**
         * <p>模型名</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>模型类型</p>
         */
        @NameInMap("ModelType")
        public String modelType;

        /**
         * <p>是否支持Reasoning</p>
         */
        @NameInMap("SupportReasoning")
        public Boolean supportReasoning;

        /**
         * <p>是否支持输出Schema</p>
         */
        @NameInMap("SupportResponseSchema")
        public Boolean supportResponseSchema;

        /**
         * <p>是否支持Vision</p>
         */
        @NameInMap("SupportVision")
        public Boolean supportVision;

        /**
         * <p>是否支持ToolCall</p>
         */
        @NameInMap("ToolCall")
        public Boolean toolCall;

        public static ConnectionModels build(java.util.Map<String, ?> map) throws Exception {
            ConnectionModels self = new ConnectionModels();
            return TeaModel.build(map, self);
        }

        public ConnectionModels setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ConnectionModels setMaxModelLength(Integer maxModelLength) {
            this.maxModelLength = maxModelLength;
            return this;
        }
        public Integer getMaxModelLength() {
            return this.maxModelLength;
        }

        public ConnectionModels setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ConnectionModels setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public ConnectionModels setSupportReasoning(Boolean supportReasoning) {
            this.supportReasoning = supportReasoning;
            return this;
        }
        public Boolean getSupportReasoning() {
            return this.supportReasoning;
        }

        public ConnectionModels setSupportResponseSchema(Boolean supportResponseSchema) {
            this.supportResponseSchema = supportResponseSchema;
            return this;
        }
        public Boolean getSupportResponseSchema() {
            return this.supportResponseSchema;
        }

        public ConnectionModels setSupportVision(Boolean supportVision) {
            this.supportVision = supportVision;
            return this;
        }
        public Boolean getSupportVision() {
            return this.supportVision;
        }

        public ConnectionModels setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

    }

    public static class ConnectionResourceMeta extends TeaModel {
        /**
         * <p>资源实例ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>资源实例名称</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static ConnectionResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ConnectionResourceMeta self = new ConnectionResourceMeta();
            return TeaModel.build(map, self);
        }

        public ConnectionResourceMeta setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConnectionResourceMeta setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
