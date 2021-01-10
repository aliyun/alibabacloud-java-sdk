// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RenewAppGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static RenewAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewAppGroupResponseBody self = new RenewAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
