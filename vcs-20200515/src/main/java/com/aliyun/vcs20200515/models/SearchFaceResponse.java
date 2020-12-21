// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchFaceResponseBody body;

    public static SearchFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponse self = new SearchFaceResponse();
        return TeaModel.build(map, self);
    }

    public SearchFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchFaceResponse setBody(SearchFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchFaceResponseBody getBody() {
        return this.body;
    }

}
