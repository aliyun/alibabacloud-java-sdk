// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPolicyFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupResponseBody self = new DetachPolicyFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
