// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UpdateVirtualPhysicalConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualPhysicalConnectionResponseBody self = new UpdateVirtualPhysicalConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualPhysicalConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVirtualPhysicalConnectionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
