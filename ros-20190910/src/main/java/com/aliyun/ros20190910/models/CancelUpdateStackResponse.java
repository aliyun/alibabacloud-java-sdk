// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelUpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackResponse self = new CancelUpdateStackResponse();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
