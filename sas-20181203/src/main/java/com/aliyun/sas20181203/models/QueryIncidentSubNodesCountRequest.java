// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentSubNodesCountRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;body&quot;: {&quot;VertexIdAndTypeList&quot;: [[&quot;b17f3a9a1a6abd6a6786208492e71912&quot;, &quot;process&quot;], [&quot;58fa3749cd7ce20f7e75424070012ed9&quot;, &quot;file&quot;]]}}</p>
     */
    @NameInMap("body")
    public String body;

    public static QueryIncidentSubNodesCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIncidentSubNodesCountRequest self = new QueryIncidentSubNodesCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryIncidentSubNodesCountRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
