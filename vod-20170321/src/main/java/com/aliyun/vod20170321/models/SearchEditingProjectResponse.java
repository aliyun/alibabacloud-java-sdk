// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchEditingProjectResponseBody body;

    public static SearchEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponse self = new SearchEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchEditingProjectResponse setBody(SearchEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchEditingProjectResponseBody getBody() {
        return this.body;
    }

}
