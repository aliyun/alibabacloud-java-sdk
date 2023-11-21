// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetSavedQueryRequest extends TeaModel {
    /**
     * <p>The ID of the template.</p>
     * <br>
     * <p>>  You can call the [ListSavedQueries](~~ListSavedQueries~~) operation to obtain the template ID.</p>
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
