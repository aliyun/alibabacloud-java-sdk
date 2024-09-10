// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexNodesRequest extends TeaModel {
    /**
     * <p>The types of the edges that you want to query.</p>
     */
    @NameInMap("EdgeLabelList")
    public java.util.List<String> edgeLabelList;

    /**
     * <p>The page number. Valid values start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The number of entries per page. Valid values start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the node that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="~~QueryIncidentTracingDetail~~">QueryIncidentTracingDetail</a> operation to query the node ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6d7738a34cc252219866d223c0093f8</p>
     */
    @NameInMap("VertexId")
    public String vertexId;

    /**
     * <p>The node label. Valid values include but are not limited to:</p>
     * <ul>
     * <li><strong>process</strong></li>
     * <li><strong>file</strong></li>
     * <li><strong>alert</strong></li>
     * <li><strong>ip</strong></li>
     * <li><strong>domain</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>process</p>
     */
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
