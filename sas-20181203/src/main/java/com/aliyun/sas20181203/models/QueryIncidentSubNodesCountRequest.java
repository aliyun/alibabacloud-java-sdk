// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryIncidentSubNodesCountRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
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
