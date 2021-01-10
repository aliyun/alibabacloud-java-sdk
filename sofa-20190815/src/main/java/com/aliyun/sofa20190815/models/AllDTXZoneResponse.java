// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllDTXZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllDTXZoneResponseBody body;

    public static AllDTXZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDTXZoneResponse self = new AllDTXZoneResponse();
        return TeaModel.build(map, self);
    }

    public AllDTXZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllDTXZoneResponse setBody(AllDTXZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public AllDTXZoneResponseBody getBody() {
        return this.body;
    }

}
