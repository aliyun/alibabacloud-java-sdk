// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountResponseBody self = new ResetAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
