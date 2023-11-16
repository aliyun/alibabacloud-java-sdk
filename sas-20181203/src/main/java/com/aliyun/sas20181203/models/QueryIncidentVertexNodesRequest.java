// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesRequest extends TeaModel {
    @NameInMap("EdgeLabelList")
    public java.util.List<String> edgeLabelList;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("VertexId")
    public String vertexId;

    @NameInMap("VertexLabel")
    public String vertexLabel;

    public static QueryIncidentVertexNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexNodesRequest self = new QueryIncidentVertexNodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexNodesRequest setEdgeLabelList(java.util.List<String> edgeLabelList) {
        this.edgeLabelList = edgeLabelList;
        return this;
    }
    public java.util.List<String> getEdgeLabelList() {
        return this.edgeLabelList;
    }

    public QueryIncidentVertexNodesRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryIncidentVertexNodesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryIncidentVertexNodesRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public QueryIncidentVertexNodesRequest setVertexLabel(String vertexLabel) {
        this.vertexLabel = vertexLabel;
        return this;
    }
    public String getVertexLabel() {
        return this.vertexLabel;
    }

}
