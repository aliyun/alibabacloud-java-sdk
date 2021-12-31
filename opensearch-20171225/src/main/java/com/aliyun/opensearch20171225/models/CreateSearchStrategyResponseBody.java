// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSearchStrategyResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static CreateSearchStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchStrategyResponseBody self = new CreateSearchStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSearchStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
