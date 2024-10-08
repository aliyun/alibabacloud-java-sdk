// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetSavedQueryRequest extends TeaModel {
    /**
     * <p>The template ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListSavedQueries~~">ListSavedQueries</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sq-GeAck****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static GetSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSavedQueryRequest self = new GetSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public GetSavedQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
