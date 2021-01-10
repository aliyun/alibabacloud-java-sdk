// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCSystemSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCSystemSwitchResponseBody body;

    public static ListLDCSystemSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCSystemSwitchResponse self = new ListLDCSystemSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCSystemSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCSystemSwitchResponse setBody(ListLDCSystemSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCSystemSwitchResponseBody getBody() {
        return this.body;
    }

}
