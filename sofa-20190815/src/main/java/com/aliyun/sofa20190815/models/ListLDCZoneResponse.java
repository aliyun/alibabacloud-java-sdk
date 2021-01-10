// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCZoneResponseBody body;

    public static ListLDCZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCZoneResponse self = new ListLDCZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCZoneResponse setBody(ListLDCZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCZoneResponseBody getBody() {
        return this.body;
    }

}
