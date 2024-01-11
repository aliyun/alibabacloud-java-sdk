// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesShrinkRequest extends TeaModel {
    /**
     * <p>The types of the edges that you want to query.</p>
     */
    @NameInMap("EdgeLabelList")
    public String edgeLabelListShrink;

    /**
     * <p>The page number. Valid values start from 1.</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The number of entries per page. Valid values start from 1.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the node that you want to query.</p>
     * <br>
     * <p>>  You can call the [QueryIncidentTracingDetail](~~QueryIncidentTracingDetail~~) operation to query the node ID.</p>
     */
    @NameInMap("VertexId")
    public String vertexId;

    /**
     * <p>The node label. Valid values include but are not limited to:</p>
     * <br>
     * <p>*   **process**</p>
     * <p>*   **file**</p>
     * <p>*   **alert**</p>
     * <p>*   **ip**</p>
     * <p>*   **domain**</p>
     */
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
