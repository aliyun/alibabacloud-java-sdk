// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class BindTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindTagResponseBody self = new BindTagResponseBody();
        return TeaModel.build(map, self);
    }

    public BindTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
