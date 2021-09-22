// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListNodeOutputsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 符合过滤条件的作业数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 输出列表
    @NameInMap("Outputs")
    public java.util.List<ListNodeOutputsResponseBodyOutputs> outputs;

    public static ListNodeOutputsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeOutputsResponseBody self = new ListNodeOutputsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeOutputsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeOutputsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListNodeOutputsResponseBody setOutputs(java.util.List<ListNodeOutputsResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<ListNodeOutputsResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public static class ListNodeOutputsResponseBodyOutputs extends TeaModel {
        // 名字
        @NameInMap("Name")
        public String name;

        // 类型
        @NameInMap("Type")
        public String type;

        // 创建时间
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("Id")
        public String id;

        // 输出所属节点 id
        @NameInMap("NodeId")
        public String nodeId;

        // 输出内容
        @NameInMap("Value")
        public String value;

        // 被扩展artifact的索引号，以0开始
        @NameInMap("ExpandedArtifactIndex")
        public Long expandedArtifactIndex;

        // 可扩展artifact的名字
        @NameInMap("ExpandableArtifactName")
        public String expandableArtifactName;

        // artifact内容
        @NameInMap("Info")
        public java.util.Map<String, ?> info;

        // rtifact生产者
        @NameInMap("Producer")
        public String producer;

        public static ListNodeOutputsResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListNodeOutputsResponseBodyOutputs self = new ListNodeOutputsResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public ListNodeOutputsResponseBodyOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeOutputsResponseBodyOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNodeOutputsResponseBodyOutputs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListNodeOutputsResponseBodyOutputs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNodeOutputsResponseBodyOutputs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodeOutputsResponseBodyOutputs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListNodeOutputsResponseBodyOutputs setExpandedArtifactIndex(Long expandedArtifactIndex) {
            this.expandedArtifactIndex = expandedArtifactIndex;
            return this;
        }
        public Long getExpandedArtifactIndex() {
            return this.expandedArtifactIndex;
        }

        public ListNodeOutputsResponseBodyOutputs setExpandableArtifactName(String expandableArtifactName) {
            this.expandableArtifactName = expandableArtifactName;
            return this;
        }
        public String getExpandableArtifactName() {
            return this.expandableArtifactName;
        }

        public ListNodeOutputsResponseBodyOutputs setInfo(java.util.Map<String, ?> info) {
            this.info = info;
            return this;
        }
        public java.util.Map<String, ?> getInfo() {
            return this.info;
        }

        public ListNodeOutputsResponseBodyOutputs setProducer(String producer) {
            this.producer = producer;
            return this;
        }
        public String getProducer() {
            return this.producer;
        }

    }

}
