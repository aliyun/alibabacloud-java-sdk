// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchTestCaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTestCaseResponseBody body;

    public static SearchTestCaseResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTestCaseResponse self = new SearchTestCaseResponse();
        return TeaModel.build(map, self);
    }

    public SearchTestCaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTestCaseResponse setBody(SearchTestCaseResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTestCaseResponseBody getBody() {
        return this.body;
    }

}
