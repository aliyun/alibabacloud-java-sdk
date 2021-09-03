// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchDirectoriesResponseBody body;

    public static SearchDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDirectoriesResponse self = new SearchDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public SearchDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDirectoriesResponse setBody(SearchDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDirectoriesResponseBody getBody() {
        return this.body;
    }

}
