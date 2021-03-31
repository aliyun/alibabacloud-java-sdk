// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSwitchesResponseBody body;

    public static ListSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSwitchesResponse self = new ListSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public ListSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSwitchesResponse setBody(ListSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSwitchesResponseBody getBody() {
        return this.body;
    }

}
