// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
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
