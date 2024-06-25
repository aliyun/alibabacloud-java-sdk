// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class QueryMetricResponseBody extends TeaModel {
    /**
     * <p>The returned statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;RequestId&quot;: &quot;E2373982-D8CD-413D-B991-8EB678******&quot;,   &quot;Data&quot;: &quot;{\&quot;data\&quot;:[{\&quot;date\&quot;:1583686800000,\&quot;count\&quot;:0,\&quot;rt\&quot;:0,\&quot;rpc\&quot;:\&quot;childSpan3\&quot;}}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E2B6A4C-6B83-4062-8B6F-AEEC1F******</p>
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
