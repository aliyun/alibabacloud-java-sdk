// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SignalResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SignalResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignalResourceResponseBody self = new SignalResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public SignalResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
