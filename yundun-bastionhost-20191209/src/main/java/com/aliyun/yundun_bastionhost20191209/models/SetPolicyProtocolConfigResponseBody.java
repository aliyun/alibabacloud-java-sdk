// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyProtocolConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyProtocolConfigResponseBody self = new SetPolicyProtocolConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyProtocolConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
