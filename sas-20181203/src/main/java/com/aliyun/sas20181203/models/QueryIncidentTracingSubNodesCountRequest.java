// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingSubNodesCountRequest extends TeaModel {
    /**
     * <p>The key-value pairs that consist of node IDs and node types. A key-value pair is an array.</p>
     */
    @NameInMap("VertexIdAndTypeList")
    public java.util.List<java.util.List<String>> vertexIdAndTypeList;

    public static QueryIncidentTracingSubNodesCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentTracingSubNodesCountRequest self = new QueryIncidentTracingSubNodesCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentTracingSubNodesCountRequest setVertexIdAndTypeList(java.util.List<java.util.List<String>> vertexIdAndTypeList) {
        this.vertexIdAndTypeList = vertexIdAndTypeList;
        return this;
    }
    public java.util.List<java.util.List<String>> getVertexIdAndTypeList() {
        return this.vertexIdAndTypeList;
    }

}
