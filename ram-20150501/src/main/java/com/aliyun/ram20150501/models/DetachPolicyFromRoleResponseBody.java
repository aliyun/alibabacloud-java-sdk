// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPolicyFromRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromRoleResponseBody self = new DetachPolicyFromRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPolicyFromRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
