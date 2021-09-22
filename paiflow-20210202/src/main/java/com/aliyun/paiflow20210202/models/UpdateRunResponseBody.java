// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdateRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRunResponseBody self = new UpdateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
