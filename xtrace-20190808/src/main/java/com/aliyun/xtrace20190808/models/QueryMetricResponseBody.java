// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class QueryMetricResponseBody extends TeaModel {
    /**
     * <p>The returned statistics.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricResponseBody self = new QueryMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
