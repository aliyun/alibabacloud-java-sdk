// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DeleteSavedQueryRequest extends TeaModel {
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
