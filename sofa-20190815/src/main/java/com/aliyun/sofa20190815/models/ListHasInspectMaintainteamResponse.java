// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectMaintainteamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectMaintainteamResponseBody body;

    public static ListHasInspectMaintainteamResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectMaintainteamResponse self = new ListHasInspectMaintainteamResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectMaintainteamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectMaintainteamResponse setBody(ListHasInspectMaintainteamResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectMaintainteamResponseBody getBody() {
        return this.body;
    }

}
