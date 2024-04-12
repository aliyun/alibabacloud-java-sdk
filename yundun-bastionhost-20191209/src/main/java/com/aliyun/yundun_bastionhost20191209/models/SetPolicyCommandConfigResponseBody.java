// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyCommandConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyCommandConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyCommandConfigResponseBody self = new SetPolicyCommandConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyCommandConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
