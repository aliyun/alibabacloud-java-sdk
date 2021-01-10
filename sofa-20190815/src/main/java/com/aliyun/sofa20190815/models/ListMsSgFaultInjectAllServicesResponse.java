// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAllServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgFaultInjectAllServicesResponseBody body;

    public static ListMsSgFaultInjectAllServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAllServicesResponse self = new ListMsSgFaultInjectAllServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAllServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgFaultInjectAllServicesResponse setBody(ListMsSgFaultInjectAllServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgFaultInjectAllServicesResponseBody getBody() {
        return this.body;
    }

}
