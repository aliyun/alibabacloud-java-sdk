// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudiencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAudiencesResponseBody body;

    public static SearchAudiencesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAudiencesResponse self = new SearchAudiencesResponse();
        return TeaModel.build(map, self);
    }

    public SearchAudiencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAudiencesResponse setBody(SearchAudiencesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAudiencesResponseBody getBody() {
        return this.body;
    }

}
