// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelReceiveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    public static TunnelReceiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TunnelReceiveResponseBody self = new TunnelReceiveResponseBody();
        return TeaModel.build(map, self);
    }

    public TunnelReceiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TunnelReceiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
