// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXWhitelistZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDTXWhitelistZonesResponseBody body;

    public static ListDTXWhitelistZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDTXWhitelistZonesResponse self = new ListDTXWhitelistZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListDTXWhitelistZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDTXWhitelistZonesResponse setBody(ListDTXWhitelistZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDTXWhitelistZonesResponseBody getBody() {
        return this.body;
    }

}
