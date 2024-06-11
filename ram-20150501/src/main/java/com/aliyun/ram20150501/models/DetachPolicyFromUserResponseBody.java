// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPolicyFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromUserResponseBody self = new DetachPolicyFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
