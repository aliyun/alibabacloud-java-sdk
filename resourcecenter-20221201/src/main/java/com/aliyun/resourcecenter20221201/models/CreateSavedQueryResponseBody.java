// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateSavedQueryResponseBody extends TeaModel {
    /**
     * <p>The query ID.</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavedQueryResponseBody self = new CreateSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavedQueryResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public CreateSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
