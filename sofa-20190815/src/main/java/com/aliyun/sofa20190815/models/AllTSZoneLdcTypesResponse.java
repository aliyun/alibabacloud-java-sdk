// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllTSZoneLdcTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllTSZoneLdcTypesResponseBody body;

    public static AllTSZoneLdcTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        AllTSZoneLdcTypesResponse self = new AllTSZoneLdcTypesResponse();
        return TeaModel.build(map, self);
    }

    public AllTSZoneLdcTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllTSZoneLdcTypesResponse setBody(AllTSZoneLdcTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public AllTSZoneLdcTypesResponseBody getBody() {
        return this.body;
    }

}
