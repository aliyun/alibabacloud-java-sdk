// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreApiTreeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<AiStoreApiNode> data;

    public static QueryAiStoreApiTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreApiTreeResponseBody self = new QueryAiStoreApiTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreApiTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiStoreApiTreeResponseBody setData(java.util.List<AiStoreApiNode> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AiStoreApiNode> getData() {
        return this.data;
    }

}
