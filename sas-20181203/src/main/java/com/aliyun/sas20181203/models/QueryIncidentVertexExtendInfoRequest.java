// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentVertexExtendInfoRequest extends TeaModel {
    /**
     * <p>The page number. Valid values start from 1.</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>The type of the edge that you want to query. Valid values include but are not limited to:</p>
     * <br>
     * <p>*   **process_exec_file:** A process executes a file.</p>
     * <p>*   **process_connect_ip:** A process connects to an IP address.</p>
     * <p>*   **domain_trgger_alert:** A domain name triggers an alert.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RelationType")
    public String relationType;

    /**
     * <p>The number of entries per page. Valid values start from 1.</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The ID of the node that you want to query.</p>
     * <br>
     * <p>>  You can call the [QueryIncidentTracingDetail](~~QueryIncidentTracingDetail~~) operation to query the node ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
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
