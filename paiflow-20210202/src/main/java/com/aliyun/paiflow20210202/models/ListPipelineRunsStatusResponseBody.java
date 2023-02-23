// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunsStatusResponseBody extends TeaModel {
    @NameInMap("Nodes")
    public java.util.List<ListPipelineRunsStatusResponseBodyNodes> nodes;

    @NameInMap("Outputs")
    public java.util.List<ListPipelineRunsStatusResponseBodyOutputs> outputs;

    @NameInMap("PipelineRuns")
    public java.util.List<ListPipelineRunsStatusResponseBodyPipelineRuns> pipelineRuns;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPipelineRunsStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsStatusResponseBody self = new ListPipelineRunsStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsStatusResponseBody setNodes(java.util.List<ListPipelineRunsStatusResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListPipelineRunsStatusResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListPipelineRunsStatusResponseBody setOutputs(java.util.List<ListPipelineRunsStatusResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ListPipelineRunsStatusResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public ListPipelineRunsStatusResponseBody setPipelineRuns(java.util.List<ListPipelineRunsStatusResponseBodyPipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
        return this;
    }
    public java.util.List<ListPipelineRunsStatusResponseBodyPipelineRuns> getPipelineRuns() {
        return this.pipelineRuns;
    }

    public ListPipelineRunsStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPipelineRunsStatusResponseBodyNodes extends TeaModel {
        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("InputArtifactArchived")
        public Boolean inputArtifactArchived;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("OutputArtifactArchived")
        public Boolean outputArtifactArchived;

        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        @NameInMap("StartedAt")
        public String startedAt;

        @NameInMap("Status")
        public String status;

        public static ListPipelineRunsStatusResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsStatusResponseBodyNodes self = new ListPipelineRunsStatusResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsStatusResponseBodyNodes setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListPipelineRunsStatusResponseBodyNodes setInputArtifactArchived(Boolean inputArtifactArchived) {
            this.inputArtifactArchived = inputArtifactArchived;
            return this;
        }
        public Boolean getInputArtifactArchived() {
            return this.inputArtifactArchived;
        }

        public ListPipelineRunsStatusResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunsStatusResponseBodyNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListPipelineRunsStatusResponseBodyNodes setOutputArtifactArchived(Boolean outputArtifactArchived) {
            this.outputArtifactArchived = outputArtifactArchived;
            return this;
        }
        public Boolean getOutputArtifactArchived() {
            return this.outputArtifactArchived;
        }

        public ListPipelineRunsStatusResponseBodyNodes setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsStatusResponseBodyNodes setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListPipelineRunsStatusResponseBodyNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPipelineRunsStatusResponseBodyOutputs extends TeaModel {
        @NameInMap("ExpandableArtifactName")
        public String expandableArtifactName;

        @NameInMap("ExpandedArtifactIndex")
        public Integer expandedArtifactIndex;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        @NameInMap("Producer")
        public String producer;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListPipelineRunsStatusResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsStatusResponseBodyOutputs self = new ListPipelineRunsStatusResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsStatusResponseBodyOutputs setExpandableArtifactName(String expandableArtifactName) {
            this.expandableArtifactName = expandableArtifactName;
            return this;
        }
        public String getExpandableArtifactName() {
            return this.expandableArtifactName;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setExpandedArtifactIndex(Integer expandedArtifactIndex) {
            this.expandedArtifactIndex = expandedArtifactIndex;
            return this;
        }
        public Integer getExpandedArtifactIndex() {
            return this.expandedArtifactIndex;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setProducer(String producer) {
            this.producer = producer;
            return this;
        }
        public String getProducer() {
            return this.producer;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPipelineRunsStatusResponseBodyOutputs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPipelineRunsStatusResponseBodyPipelineRuns extends TeaModel {
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("ParentUserId")
        public String parentUserId;

        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static ListPipelineRunsStatusResponseBodyPipelineRuns build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunsStatusResponseBodyPipelineRuns self = new ListPipelineRunsStatusResponseBodyPipelineRuns();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setParentUserId(String parentUserId) {
            this.parentUserId = parentUserId;
            return this;
        }
        public String getParentUserId() {
            return this.parentUserId;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineRunsStatusResponseBodyPipelineRuns setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
