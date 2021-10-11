// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreRegionsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AiStoreUserTask> data;

    public static QueryAiStoreRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreRegionsResponseBody self = new QueryAiStoreRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiStoreRegionsResponseBody setData(java.util.List<AiStoreUserTask> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AiStoreUserTask> getData() {
        return this.data;
    }

}
