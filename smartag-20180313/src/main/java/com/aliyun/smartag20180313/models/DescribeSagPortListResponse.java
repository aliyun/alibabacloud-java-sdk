// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSagPortListResponseBody body;

    public static DescribeSagPortListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortListResponse self = new DescribeSagPortListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagPortListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagPortListResponse setBody(DescribeSagPortListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagPortListResponseBody getBody() {
        return this.body;
    }

}
