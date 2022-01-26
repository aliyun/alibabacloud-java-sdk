// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class GetPictureSearchResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPictureSearchResultsResponseBody body;

    public static GetPictureSearchResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchResultsResponse self = new GetPictureSearchResultsResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPictureSearchResultsResponse setBody(GetPictureSearchResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPictureSearchResultsResponseBody getBody() {
        return this.body;
    }

}
