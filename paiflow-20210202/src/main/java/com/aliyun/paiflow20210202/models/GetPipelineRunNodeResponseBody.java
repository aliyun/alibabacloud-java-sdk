// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineRunNodeResponseBody extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Metadata")
    public GetPipelineRunNodeResponseBodyMetadata metadata;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public GetPipelineRunNodeResponseBodySpec spec;

    @NameInMap("StatusInfo")
    public GetPipelineRunNodeResponseBodyStatusInfo statusInfo;

    public static GetPipelineRunNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunNodeResponseBody self = new GetPipelineRunNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunNodeResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetPipelineRunNodeResponseBody setMetadata(GetPipelineRunNodeResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public GetPipelineRunNodeResponseBodyMetadata getMetadata() {
        return this.metadata;
    }

    public GetPipelineRunNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineRunNodeResponseBody setSpec(GetPipelineRunNodeResponseBodySpec spec) {
        this.spec = spec;
        return this;
    }
    public GetPipelineRunNodeResponseBodySpec getSpec() {
        return this.spec;
    }

    public GetPipelineRunNodeResponseBody setStatusInfo(GetPipelineRunNodeResponseBodyStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    public GetPipelineRunNodeResponseBodyStatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    public static class GetPipelineRunNodeResponseBodyMetadata extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("RelatedNodeIds")
        public java.util.List<String> relatedNodeIds;

        @NameInMap("Version")
        public String version;

        public static GetPipelineRunNodeResponseBodyMetadata build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodyMetadata self = new GetPipelineRunNodeResponseBodyMetadata();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodyMetadata setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetPipelineRunNodeResponseBodyMetadata setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetPipelineRunNodeResponseBodyMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineRunNodeResponseBodyMetadata setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetPipelineRunNodeResponseBodyMetadata setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetPipelineRunNodeResponseBodyMetadata setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetPipelineRunNodeResponseBodyMetadata setRelatedNodeIds(java.util.List<String> relatedNodeIds) {
            this.relatedNodeIds = relatedNodeIds;
            return this;
        }
        public java.util.List<String> getRelatedNodeIds() {
            return this.relatedNodeIds;
        }

        public GetPipelineRunNodeResponseBodyMetadata setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetPipelineRunNodeResponseBodySpecInputs extends TeaModel {
        @NameInMap("Artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        @NameInMap("Parameters")
        public java.util.List<java.util.Map<String, ?>> parameters;

        public static GetPipelineRunNodeResponseBodySpecInputs build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodySpecInputs self = new GetPipelineRunNodeResponseBodySpecInputs();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodySpecInputs setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public GetPipelineRunNodeResponseBodySpecInputs setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getParameters() {
            return this.parameters;
        }

    }

    public static class GetPipelineRunNodeResponseBodySpecOutputs extends TeaModel {
        @NameInMap("Artifacts")
        public java.util.List<java.util.Map<String, ?>> artifacts;

        @NameInMap("Parameters")
        public java.util.List<java.util.Map<String, ?>> parameters;

        public static GetPipelineRunNodeResponseBodySpecOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodySpecOutputs self = new GetPipelineRunNodeResponseBodySpecOutputs();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodySpecOutputs setArtifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        public GetPipelineRunNodeResponseBodySpecOutputs setParameters(java.util.List<java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getParameters() {
            return this.parameters;
        }

    }

    public static class GetPipelineRunNodeResponseBodySpecWithSequence extends TeaModel {
        @NameInMap("End")
        public Integer end;

        @NameInMap("Format")
        public String format;

        @NameInMap("Start")
        public Integer start;

        public static GetPipelineRunNodeResponseBodySpecWithSequence build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodySpecWithSequence self = new GetPipelineRunNodeResponseBodySpecWithSequence();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodySpecWithSequence setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public GetPipelineRunNodeResponseBodySpecWithSequence setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetPipelineRunNodeResponseBodySpecWithSequence setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class GetPipelineRunNodeResponseBodySpec extends TeaModel {
        @NameInMap("Dependencies")
        public java.util.List<String> dependencies;

        @NameInMap("HasPipelines")
        public Boolean hasPipelines;

        @NameInMap("Inputs")
        public GetPipelineRunNodeResponseBodySpecInputs inputs;

        @NameInMap("Outputs")
        public GetPipelineRunNodeResponseBodySpecOutputs outputs;

        @NameInMap("Parallelism")
        public Integer parallelism;

        @NameInMap("Pipelines")
        public java.util.List<java.util.Map<String, ?>> pipelines;

        @NameInMap("When")
        public String when;

        @NameInMap("WithItems")
        public java.util.List<String> withItems;

        @NameInMap("WithParam")
        public String withParam;

        @NameInMap("WithSequence")
        public GetPipelineRunNodeResponseBodySpecWithSequence withSequence;

        public static GetPipelineRunNodeResponseBodySpec build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodySpec self = new GetPipelineRunNodeResponseBodySpec();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodySpec setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public GetPipelineRunNodeResponseBodySpec setHasPipelines(Boolean hasPipelines) {
            this.hasPipelines = hasPipelines;
            return this;
        }
        public Boolean getHasPipelines() {
            return this.hasPipelines;
        }

        public GetPipelineRunNodeResponseBodySpec setInputs(GetPipelineRunNodeResponseBodySpecInputs inputs) {
            this.inputs = inputs;
            return this;
        }
        public GetPipelineRunNodeResponseBodySpecInputs getInputs() {
            return this.inputs;
        }

        public GetPipelineRunNodeResponseBodySpec setOutputs(GetPipelineRunNodeResponseBodySpecOutputs outputs) {
            this.outputs = outputs;
            return this;
        }
        public GetPipelineRunNodeResponseBodySpecOutputs getOutputs() {
            return this.outputs;
        }

        public GetPipelineRunNodeResponseBodySpec setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

        public GetPipelineRunNodeResponseBodySpec setPipelines(java.util.List<java.util.Map<String, ?>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getPipelines() {
            return this.pipelines;
        }

        public GetPipelineRunNodeResponseBodySpec setWhen(String when) {
            this.when = when;
            return this;
        }
        public String getWhen() {
            return this.when;
        }

        public GetPipelineRunNodeResponseBodySpec setWithItems(java.util.List<String> withItems) {
            this.withItems = withItems;
            return this;
        }
        public java.util.List<String> getWithItems() {
            return this.withItems;
        }

        public GetPipelineRunNodeResponseBodySpec setWithParam(String withParam) {
            this.withParam = withParam;
            return this;
        }
        public String getWithParam() {
            return this.withParam;
        }

        public GetPipelineRunNodeResponseBodySpec setWithSequence(GetPipelineRunNodeResponseBodySpecWithSequence withSequence) {
            this.withSequence = withSequence;
            return this;
        }
        public GetPipelineRunNodeResponseBodySpecWithSequence getWithSequence() {
            return this.withSequence;
        }

    }

    public static class GetPipelineRunNodeResponseBodyStatusInfo extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<java.util.Map<String, ?>> conditions;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("Status")
        public String status;

        public static GetPipelineRunNodeResponseBodyStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineRunNodeResponseBodyStatusInfo self = new GetPipelineRunNodeResponseBodyStatusInfo();
            return TeaModel.build(map, self);
        }

        public GetPipelineRunNodeResponseBodyStatusInfo setConditions(java.util.List<java.util.Map<String, ?>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getConditions() {
            return this.conditions;
        }

        public GetPipelineRunNodeResponseBodyStatusInfo setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetPipelineRunNodeResponseBodyStatusInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetPipelineRunNodeResponseBodyStatusInfo setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetPipelineRunNodeResponseBodyStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
