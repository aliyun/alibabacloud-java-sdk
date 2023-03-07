// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchMultiAccountResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchMultiAccountResourcesResponseBody body;

    public static SearchMultiAccountResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMultiAccountResourcesResponse self = new SearchMultiAccountResourcesResponse();
        return TeaModel.build(map, self);
    }

    public SearchMultiAccountResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchMultiAccountResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchMultiAccountResourcesResponse setBody(SearchMultiAccountResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchMultiAccountResourcesResponseBody getBody() {
        return this.body;
    }

}
