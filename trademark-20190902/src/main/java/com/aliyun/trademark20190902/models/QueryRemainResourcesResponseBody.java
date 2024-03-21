// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryRemainResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryRemainResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRemainResourcesResponseBody self = new QueryRemainResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRemainResourcesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public QueryRemainResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
