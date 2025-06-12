// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>697852FB-50D7-44D9-9774-530C31EAC572</p>
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
