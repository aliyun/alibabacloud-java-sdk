// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class FoobarResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static FoobarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FoobarResponseBody self = new FoobarResponseBody();
        return TeaModel.build(map, self);
    }

    public FoobarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
