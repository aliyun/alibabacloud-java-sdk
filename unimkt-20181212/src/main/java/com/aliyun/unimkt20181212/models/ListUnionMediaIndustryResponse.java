// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListUnionMediaIndustryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUnionMediaIndustryResponseBody body;

    public static ListUnionMediaIndustryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnionMediaIndustryResponse self = new ListUnionMediaIndustryResponse();
        return TeaModel.build(map, self);
    }

    public ListUnionMediaIndustryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnionMediaIndustryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnionMediaIndustryResponse setBody(ListUnionMediaIndustryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnionMediaIndustryResponseBody getBody() {
        return this.body;
    }

}
