// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CompareOmsWildcardObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompareOmsWildcardObjectsResponseBody body;

    public static CompareOmsWildcardObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareOmsWildcardObjectsResponse self = new CompareOmsWildcardObjectsResponse();
        return TeaModel.build(map, self);
    }

    public CompareOmsWildcardObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareOmsWildcardObjectsResponse setBody(CompareOmsWildcardObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareOmsWildcardObjectsResponseBody getBody() {
        return this.body;
    }

}
