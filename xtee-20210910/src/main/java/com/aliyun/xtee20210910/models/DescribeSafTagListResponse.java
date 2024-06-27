// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSafTagListResponseBody body;

    public static DescribeSafTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafTagListResponse self = new DescribeSafTagListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSafTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSafTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSafTagListResponse setBody(DescribeSafTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSafTagListResponseBody getBody() {
        return this.body;
    }

}
