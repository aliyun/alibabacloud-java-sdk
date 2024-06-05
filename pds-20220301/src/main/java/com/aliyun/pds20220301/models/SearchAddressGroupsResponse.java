// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchAddressGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAddressGroupsResponseBody body;

    public static SearchAddressGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAddressGroupsResponse self = new SearchAddressGroupsResponse();
        return TeaModel.build(map, self);
    }

    public SearchAddressGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAddressGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAddressGroupsResponse setBody(SearchAddressGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAddressGroupsResponseBody getBody() {
        return this.body;
    }

}
