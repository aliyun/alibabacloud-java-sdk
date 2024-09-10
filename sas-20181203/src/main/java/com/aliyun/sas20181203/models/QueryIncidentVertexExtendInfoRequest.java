// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexExtendInfoRequest extends TeaModel {
    /**
     * <p>The page number. Valid values start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The type of the edge that you want to query. Valid values include but are not limited to:</p>
     * <ul>
     * <li><strong>process_exec_file:</strong> A process executes a file.</li>
     * <li><strong>process_connect_ip:</strong> A process connects to an IP address.</li>
     * <li><strong>domain_trgger_alert:</strong> A domain name triggers an alert.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>process_connect_ip</p>
     */
    @NameInMap("RelationType")
    public String relationType;

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
     * <p>29872354f741b1b044b8a9b4e2ab0535</p>
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
