// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Metadata")
    public GetNodeResponseBodyMetadata metadata;

    // 算法体
    @NameInMap("Spec")
    public GetNodeResponseBodySpec spec;

    // 状态
    @NameInMap("StatusInfo")
    public GetNodeResponseBodyStatusInfo statusInfo;

    public static GetNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponseBody self = new GetNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetNodeResponseBody setMetadata(GetNodeResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public GetNodeResponseBodyMetadata getMetadata() {
        return this.metadata;
    }

    public GetNodeResponseBody setSpec(GetNodeResponseBodySpec spec) {
        this.spec = spec;
        return this;
    }
    public GetNodeResponseBodySpec getSpec() {
        return this.spec;
    }

    public GetNodeResponseBody setStatusInfo(GetNodeResponseBodyStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    public GetNodeResponseBodyStatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    public static class GetNodeResponseBodyMetadata extends TeaModel {
        // 标识符
        @NameInMap("Identifier")
        public String identifier;

        // 名字
        @NameInMap("Name")
        public String name;

        // 提供方
        @NameInMap("Provider")
        public String provider;

        // 节点id
        @NameInMap("NodeId")
        public String nodeId;

        // 版本
        @NameInMap("Version")
        public String version;

        // 展现名
        @NameInMap("DisplayName")
        public String displayName;

        public static GetNodeResponseBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyMetadata self = new GetNodeResponseBodyMetadata();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyMetadata setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetNodeResponseBodyMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNodeResponseBodyMetadata setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetNodeResponseBodyMetadata setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetNodeResponseBodyMetadata setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetNodeResponseBodyMetadata setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class GetNodeResponseBodySpecInputs extends TeaModel {
        // artifacts
        @NameInMap("Artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        // 参数
        @NameInMap("Parameters")
        public java.util.List<java.util.Map<String, ?>> parameters;

        public static GetNodeResponseBodySpecInputs build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodySpecInputs self = new GetNodeResponseBodySpecInputs();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodySpecInputs setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public GetNodeResponseBodySpecInputs setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getParameters() {
            return this.parameters;
        }

    }

    public static class GetNodeResponseBodySpecOutputs extends TeaModel {
        // artifacts
        @NameInMap("Artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        // 参数
        @NameInMap("Parameters")
        public java.util.List<java.util.Map<String, ?>> parameters;

        public static GetNodeResponseBodySpecOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodySpecOutputs self = new GetNodeResponseBodySpecOutputs();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodySpecOutputs setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public GetNodeResponseBodySpecOutputs setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getParameters() {
            return this.parameters;
        }

    }

    public static class GetNodeResponseBodySpec extends TeaModel {
        // 是否有pipeline
        @NameInMap("HasPipelines")
        public Boolean hasPipelines;

        // 依赖列表
        @NameInMap("Dependencies")
        public java.util.List<String> dependencies;

        // pipeline列表
        @NameInMap("Pipelines")
        public java.util.List<java.util.Map<String, ?>> pipelines;

        // 输入
        @NameInMap("Inputs")
        public GetNodeResponseBodySpecInputs inputs;

        // 输出
        @NameInMap("Outputs")
        public GetNodeResponseBodySpecOutputs outputs;

        public static GetNodeResponseBodySpec build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodySpec self = new GetNodeResponseBodySpec();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodySpec setHasPipelines(Boolean hasPipelines) {
            this.hasPipelines = hasPipelines;
            return this;
        }
        public Boolean getHasPipelines() {
            return this.hasPipelines;
        }

        public GetNodeResponseBodySpec setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public GetNodeResponseBodySpec setPipelines(java.util.List<java.util.Map<String, ?>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPipelines() {
            return this.pipelines;
        }

        public GetNodeResponseBodySpec setInputs(GetNodeResponseBodySpecInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public GetNodeResponseBodySpecInputs getInputs() {
            return this.inputs;
        }

        public GetNodeResponseBodySpec setOutputs(GetNodeResponseBodySpecOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetNodeResponseBodySpecOutputs getOutputs() {
            return this.outputs;
        }

    }

    public static class GetNodeResponseBodyStatusInfo extends TeaModel {
        // 结束时间
        @NameInMap("FinishedAt")
        public String finishedAt;

        // 开始时间
        @NameInMap("StartedAt")
        public String startedAt;

        // 状态
        @NameInMap("Status")
        public String status;

        public static GetNodeResponseBodyStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyStatusInfo self = new GetNodeResponseBodyStatusInfo();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyStatusInfo setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetNodeResponseBodyStatusInfo setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetNodeResponseBodyStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
