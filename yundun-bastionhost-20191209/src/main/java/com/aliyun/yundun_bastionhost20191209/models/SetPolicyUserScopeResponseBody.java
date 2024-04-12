// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyUserScopeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyUserScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyUserScopeResponseBody self = new SetPolicyUserScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyUserScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
