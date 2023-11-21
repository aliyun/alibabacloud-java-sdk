// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteSavedQueryRequest extends TeaModel {
    /**
     * <p>The ID of the template.</p>
     * <br>
     * <p>You can call the [ListSavedQueries](~~ListSavedQueries~~) operation to obtain the template ID.</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    public static DeleteSavedQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSavedQueryRequest self = new DeleteSavedQueryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSavedQueryRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

}
