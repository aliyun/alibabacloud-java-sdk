// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetHostAccountPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetHostAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetHostAccountPasswordResponseBody self = new ResetHostAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetHostAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
