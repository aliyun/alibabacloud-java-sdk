// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMetaHierarchyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSMetaHierarchyResponseBody body;

    public static GetDWSMetaHierarchyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMetaHierarchyResponse self = new GetDWSMetaHierarchyResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSMetaHierarchyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSMetaHierarchyResponse setBody(GetDWSMetaHierarchyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSMetaHierarchyResponseBody getBody() {
        return this.body;
    }

}
