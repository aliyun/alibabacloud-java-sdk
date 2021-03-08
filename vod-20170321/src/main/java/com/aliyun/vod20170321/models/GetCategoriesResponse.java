// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCategoriesResponseBody body;

    public static GetCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesResponse self = new GetCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public GetCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCategoriesResponse setBody(GetCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCategoriesResponseBody getBody() {
        return this.body;
    }

}
