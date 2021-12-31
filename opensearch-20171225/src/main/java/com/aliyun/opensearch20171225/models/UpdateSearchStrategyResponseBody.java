// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSearchStrategyResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static UpdateSearchStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSearchStrategyResponseBody self = new UpdateSearchStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSearchStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
