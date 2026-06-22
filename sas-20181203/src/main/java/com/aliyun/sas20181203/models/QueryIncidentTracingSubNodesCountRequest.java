// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentTracingSubNodesCountRequest extends TeaModel {
    /**
     * <p>List of key-value pairs composed of node IDs and types, where key-value pairs exist in the form of arrays</p>
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
