// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchWorkitemWithTotalCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchWorkitemWithTotalCountResponseBody body;

    public static SearchWorkitemWithTotalCountResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchWorkitemWithTotalCountResponse self = new SearchWorkitemWithTotalCountResponse();
        return TeaModel.build(map, self);
    }

    public SearchWorkitemWithTotalCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchWorkitemWithTotalCountResponse setBody(SearchWorkitemWithTotalCountResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchWorkitemWithTotalCountResponseBody getBody() {
        return this.body;
    }

}
