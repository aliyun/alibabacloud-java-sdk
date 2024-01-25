// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreApiTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AiStoreApiNode> data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAiStoreApiTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreApiTreeResponseBody self = new QueryAiStoreApiTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreApiTreeResponseBody setData(java.util.List<AiStoreApiNode> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AiStoreApiNode> getData() {
        return this.data;
    }

    public QueryAiStoreApiTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
