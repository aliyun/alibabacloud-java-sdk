// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreRegionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AiStoreUserTask> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAiStoreRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreRegionsResponseBody self = new QueryAiStoreRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreRegionsResponseBody setData(java.util.List<AiStoreUserTask> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AiStoreUserTask> getData() {
        return this.data;
    }

    public QueryAiStoreRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
