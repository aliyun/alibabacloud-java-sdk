// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveSearchStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RemoveSearchStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSearchStrategyResponseBody self = new RemoveSearchStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSearchStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
