// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadCategoryGroupListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadCategoryGroupListResponseBody body;

    public static ReadCategoryGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadCategoryGroupListResponse self = new ReadCategoryGroupListResponse();
        return TeaModel.build(map, self);
    }

    public ReadCategoryGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadCategoryGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadCategoryGroupListResponse setBody(ReadCategoryGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadCategoryGroupListResponseBody getBody() {
        return this.body;
    }

}
