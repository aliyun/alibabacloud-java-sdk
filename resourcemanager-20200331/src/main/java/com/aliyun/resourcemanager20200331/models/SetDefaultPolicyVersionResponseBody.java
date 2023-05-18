// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultPolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultPolicyVersionResponseBody self = new SetDefaultPolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultPolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
