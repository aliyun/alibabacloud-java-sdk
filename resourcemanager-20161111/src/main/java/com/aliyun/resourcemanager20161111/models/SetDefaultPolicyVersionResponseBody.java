// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class SetDefaultPolicyVersionResponseBody extends TeaModel {
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
