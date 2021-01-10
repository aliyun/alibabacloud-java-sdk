// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMetaHierarchystringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSMetaHierarchystringResponseBody body;

    public static GetDWSMetaHierarchystringResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMetaHierarchystringResponse self = new GetDWSMetaHierarchystringResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSMetaHierarchystringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSMetaHierarchystringResponse setBody(GetDWSMetaHierarchystringResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSMetaHierarchystringResponseBody getBody() {
        return this.body;
    }

}
