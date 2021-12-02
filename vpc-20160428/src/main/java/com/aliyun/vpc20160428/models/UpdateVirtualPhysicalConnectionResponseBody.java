// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否修改成功
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
