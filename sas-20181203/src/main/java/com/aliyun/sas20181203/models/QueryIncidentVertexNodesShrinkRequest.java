// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesShrinkRequest extends TeaModel {
    @NameInMap("EdgeLabelList")
    public String edgeLabelListShrink;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("VertexId")
    public String vertexId;

    @NameInMap("VertexLabel")
    public String vertexLabel;

    public static QueryIncidentVertexNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexNodesShrinkRequest self = new QueryIncidentVertexNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexNodesShrinkRequest setEdgeLabelListShrink(String edgeLabelListShrink) {
        this.edgeLabelListShrink = edgeLabelListShrink;
        return this;
    }
    public String getEdgeLabelListShrink() {
        return this.edgeLabelListShrink;
    }

    public QueryIncidentVertexNodesShrinkRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryIncidentVertexNodesShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryIncidentVertexNodesShrinkRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public QueryIncidentVertexNodesShrinkRequest setVertexLabel(String vertexLabel) {
        this.vertexLabel = vertexLabel;
        return this;
    }
    public String getVertexLabel() {
        return this.vertexLabel;
    }

}
