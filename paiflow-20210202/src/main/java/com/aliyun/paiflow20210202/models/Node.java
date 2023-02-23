// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Metadata")
    public NodeMetadata metadata;

    @NameInMap("Spec")
    public NodeSpec spec;

    @NameInMap("StatusInfo")
    public NodeStatusInfo statusInfo;

    public static Node build(java.util.Map<String, ?> map) throws Exception {
        Node self = new Node();
        return TeaModel.build(map, self);
    }

    public Node setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public Node setMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public NodeMetadata getMetadata() {
        return this.metadata;
    }

    public Node setSpec(NodeSpec spec) {
        this.spec = spec;
        return this;
    }
    public NodeSpec getSpec() {
        return this.spec;
    }

    public Node setStatusInfo(NodeStatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }
    public NodeStatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    public static class NodeMetadata extends TeaModel {
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

        public static NodeMetadata build(java.util.Map<String, ?> map) throws Exception {
            NodeMetadata self = new NodeMetadata();
            return TeaModel.build(map, self);
        }

        public NodeMetadata setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public NodeMetadata setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public NodeMetadata setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public NodeMetadata setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public NodeMetadata setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public NodeMetadata setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public NodeMetadata setRelatedNodeIds(java.util.List<String> relatedNodeIds) {
            this.relatedNodeIds = relatedNodeIds;
            return this;
        }
        public java.util.List<String> getRelatedNodeIds() {
            return this.relatedNodeIds;
        }

        public NodeMetadata setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class NodeSpecWithSequence extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Format")
        public String format;

        @NameInMap("Start")
        public Long start;

        public static NodeSpecWithSequence build(java.util.Map<String, ?> map) throws Exception {
            NodeSpecWithSequence self = new NodeSpecWithSequence();
            return TeaModel.build(map, self);
        }

        public NodeSpecWithSequence setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public NodeSpecWithSequence setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public NodeSpecWithSequence setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

    }

    public static class NodeSpec extends TeaModel {
        @NameInMap("Dependencies")
        public java.util.List<String> dependencies;

        @NameInMap("HasPipelines")
        public Boolean hasPipelines;

        @NameInMap("Inputs")
        public NodeIO inputs;

        @NameInMap("Outputs")
        public NodeIO outputs;

        @NameInMap("Parallelism")
        public Long parallelism;

        @NameInMap("Pipelines")
        public java.util.List<Node> pipelines;

        @NameInMap("When")
        public String when;

        @NameInMap("WithItems")
        public java.util.List<String> withItems;

        @NameInMap("WithParam")
        public String withParam;

        @NameInMap("WithSequence")
        public NodeSpecWithSequence withSequence;

        public static NodeSpec build(java.util.Map<String, ?> map) throws Exception {
            NodeSpec self = new NodeSpec();
            return TeaModel.build(map, self);
        }

        public NodeSpec setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public NodeSpec setHasPipelines(Boolean hasPipelines) {
            this.hasPipelines = hasPipelines;
            return this;
        }
        public Boolean getHasPipelines() {
            return this.hasPipelines;
        }

        public NodeSpec setInputs(NodeIO inputs) {
            this.inputs = inputs;
            return this;
        }
        public NodeIO getInputs() {
            return this.inputs;
        }

        public NodeSpec setOutputs(NodeIO outputs) {
            this.outputs = outputs;
            return this;
        }
        public NodeIO getOutputs() {
            return this.outputs;
        }

        public NodeSpec setParallelism(Long parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Long getParallelism() {
            return this.parallelism;
        }

        public NodeSpec setPipelines(java.util.List<Node> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<Node> getPipelines() {
            return this.pipelines;
        }

        public NodeSpec setWhen(String when) {
            this.when = when;
            return this;
        }
        public String getWhen() {
            return this.when;
        }

        public NodeSpec setWithItems(java.util.List<String> withItems) {
            this.withItems = withItems;
            return this;
        }
        public java.util.List<String> getWithItems() {
            return this.withItems;
        }

        public NodeSpec setWithParam(String withParam) {
            this.withParam = withParam;
            return this;
        }
        public String getWithParam() {
            return this.withParam;
        }

        public NodeSpec setWithSequence(NodeSpecWithSequence withSequence) {
            this.withSequence = withSequence;
            return this;
        }
        public NodeSpecWithSequence getWithSequence() {
            return this.withSequence;
        }

    }

    public static class NodeStatusInfoConditions extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static NodeStatusInfoConditions build(java.util.Map<String, ?> map) throws Exception {
            NodeStatusInfoConditions self = new NodeStatusInfoConditions();
            return TeaModel.build(map, self);
        }

        public NodeStatusInfoConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public NodeStatusInfoConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class NodeStatusInfo extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<NodeStatusInfoConditions> conditions;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("Status")
        public String status;

        public static NodeStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            NodeStatusInfo self = new NodeStatusInfo();
            return TeaModel.build(map, self);
        }

        public NodeStatusInfo setConditions(java.util.List<NodeStatusInfoConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<NodeStatusInfoConditions> getConditions() {
            return this.conditions;
        }

        public NodeStatusInfo setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public NodeStatusInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public NodeStatusInfo setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public NodeStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
