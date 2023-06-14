// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RemoveSubInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSubInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSubInstanceResponseBody self = new RemoveSubInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSubInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
