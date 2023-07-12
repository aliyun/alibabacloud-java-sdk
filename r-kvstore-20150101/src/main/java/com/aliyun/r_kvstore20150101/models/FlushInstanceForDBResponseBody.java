// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class FlushInstanceForDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FlushInstanceForDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlushInstanceForDBResponseBody self = new FlushInstanceForDBResponseBody();
        return TeaModel.build(map, self);
    }

    public FlushInstanceForDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
