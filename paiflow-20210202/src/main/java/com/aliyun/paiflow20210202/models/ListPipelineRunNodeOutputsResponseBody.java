// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelineRunNodeOutputsResponseBody extends TeaModel {
    @NameInMap("Outputs")
    public java.util.List<ListPipelineRunNodeOutputsResponseBodyOutputs> outputs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPipelineRunNodeOutputsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunNodeOutputsResponseBody self = new ListPipelineRunNodeOutputsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunNodeOutputsResponseBody setOutputs(java.util.List<ListPipelineRunNodeOutputsResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ListPipelineRunNodeOutputsResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public ListPipelineRunNodeOutputsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineRunNodeOutputsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPipelineRunNodeOutputsResponseBodyOutputs extends TeaModel {
        @NameInMap("ExpandableArtifactName")
        public String expandableArtifactName;

        @NameInMap("ExpandedArtifactIndex")
        public Long expandedArtifactIndex;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Info")
        public java.util.Map<String, ?> info;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Producer")
        public String producer;

        @NameInMap("Type")
        public String type;

        public static ListPipelineRunNodeOutputsResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineRunNodeOutputsResponseBodyOutputs self = new ListPipelineRunNodeOutputsResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setExpandableArtifactName(String expandableArtifactName) {
            this.expandableArtifactName = expandableArtifactName;
            return this;
        }
        public String getExpandableArtifactName() {
            return this.expandableArtifactName;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setExpandedArtifactIndex(Long expandedArtifactIndex) {
            this.expandedArtifactIndex = expandedArtifactIndex;
            return this;
        }
        public Long getExpandedArtifactIndex() {
            return this.expandedArtifactIndex;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setInfo(java.util.Map<String, ?> info) {
            this.info = info;
            return this;
        }
        public java.util.Map<String, ?> getInfo() {
            return this.info;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setProducer(String producer) {
            this.producer = producer;
            return this;
        }
        public String getProducer() {
            return this.producer;
        }

        public ListPipelineRunNodeOutputsResponseBodyOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
