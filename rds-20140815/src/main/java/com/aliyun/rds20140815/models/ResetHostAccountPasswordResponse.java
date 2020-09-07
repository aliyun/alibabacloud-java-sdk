// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetHostAccountPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetHostAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetHostAccountPasswordResponse self = new ResetHostAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetHostAccountPasswordResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
