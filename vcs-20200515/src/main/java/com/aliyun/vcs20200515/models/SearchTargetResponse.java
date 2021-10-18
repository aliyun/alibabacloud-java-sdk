// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTargetResponseBody body;

    public static SearchTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTargetResponse self = new SearchTargetResponse();
        return TeaModel.build(map, self);
    }

    public SearchTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTargetResponse setBody(SearchTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTargetResponseBody getBody() {
        return this.body;
    }

}
