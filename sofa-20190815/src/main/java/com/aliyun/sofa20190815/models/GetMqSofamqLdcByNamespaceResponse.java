// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqLdcByNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqLdcByNamespaceResponseBody body;

    public static GetMqSofamqLdcByNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqLdcByNamespaceResponse self = new GetMqSofamqLdcByNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqLdcByNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqLdcByNamespaceResponse setBody(GetMqSofamqLdcByNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqLdcByNamespaceResponseBody getBody() {
        return this.body;
    }

}
