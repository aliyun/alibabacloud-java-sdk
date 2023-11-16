// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexExtendInfoRequest extends TeaModel {
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("RelationType")
    public String relationType;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("VertexId")
    public String vertexId;

    @NameInMap("VertexLabel")
    public String vertexLabel;

    public static QueryIncidentVertexExtendInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentVertexExtendInfoRequest self = new QueryIncidentVertexExtendInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentVertexExtendInfoRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public QueryIncidentVertexExtendInfoRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

    public QueryIncidentVertexExtendInfoRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryIncidentVertexExtendInfoRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public QueryIncidentVertexExtendInfoRequest setVertexLabel(String vertexLabel) {
        this.vertexLabel = vertexLabel;
        return this;
    }
    public String getVertexLabel() {
        return this.vertexLabel;
    }

}
