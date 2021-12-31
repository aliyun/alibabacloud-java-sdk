// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetSavedSearchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SavedSearch body;

    public static GetSavedSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSavedSearchResponse self = new GetSavedSearchResponse();
        return TeaModel.build(map, self);
    }

    public GetSavedSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSavedSearchResponse setBody(SavedSearch body) {
        this.body = body;
        return this;
    }
    public SavedSearch getBody() {
        return this.body;
    }

}
