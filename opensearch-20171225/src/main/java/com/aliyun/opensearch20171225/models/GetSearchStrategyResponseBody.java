// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetSearchStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSearchStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSearchStrategyResponseBody self = new GetSearchStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSearchStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
