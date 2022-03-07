// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class QueryConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static QueryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigResponseBody self = new QueryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
