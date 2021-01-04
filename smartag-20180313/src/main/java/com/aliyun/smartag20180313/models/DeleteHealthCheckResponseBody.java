// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteHealthCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHealthCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthCheckResponseBody self = new DeleteHealthCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHealthCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
