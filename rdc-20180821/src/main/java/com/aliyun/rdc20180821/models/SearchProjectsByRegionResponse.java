// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchProjectsByRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchProjectsByRegionResponseBody body;

    public static SearchProjectsByRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchProjectsByRegionResponse self = new SearchProjectsByRegionResponse();
        return TeaModel.build(map, self);
    }

    public SearchProjectsByRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchProjectsByRegionResponse setBody(SearchProjectsByRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchProjectsByRegionResponseBody getBody() {
        return this.body;
    }

}
