// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetCaCertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // base64 encode format
    @NameInMap("CaCert")
    public String caCert;

    public static GetCaCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCaCertResponseBody self = new GetCaCertResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCaCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCaCertResponseBody setCaCert(String caCert) {
        this.caCert = caCert;
        return this;
    }
    public String getCaCert() {
        return this.caCert;
    }

}
