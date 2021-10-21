// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SearchTmOnsalesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTmOnsalesResponseBody body;

    public static SearchTmOnsalesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTmOnsalesResponse self = new SearchTmOnsalesResponse();
        return TeaModel.build(map, self);
    }

    public SearchTmOnsalesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTmOnsalesResponse setBody(SearchTmOnsalesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTmOnsalesResponseBody getBody() {
        return this.body;
    }

}
