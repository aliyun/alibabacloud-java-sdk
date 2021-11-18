// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkVSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNetworkVSwitchesResponseBody body;

    public static ListNetworkVSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkVSwitchesResponse self = new ListNetworkVSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkVSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkVSwitchesResponse setBody(ListNetworkVSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkVSwitchesResponseBody getBody() {
        return this.body;
    }

}
