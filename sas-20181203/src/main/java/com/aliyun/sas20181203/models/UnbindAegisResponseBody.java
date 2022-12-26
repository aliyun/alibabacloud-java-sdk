// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnbindAegisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAegisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAegisResponseBody self = new UnbindAegisResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAegisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
