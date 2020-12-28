// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListIpOrHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpOrHostsResponseBody body;

    public static ListIpOrHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpOrHostsResponse self = new ListIpOrHostsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpOrHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpOrHostsResponse setBody(ListIpOrHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpOrHostsResponseBody getBody() {
        return this.body;
    }

}
