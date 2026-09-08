// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataMaskingInstancesResponseBody body;

    public static ListDataMaskingInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingInstancesResponse self = new ListDataMaskingInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataMaskingInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataMaskingInstancesResponse setBody(ListDataMaskingInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataMaskingInstancesResponseBody getBody() {
        return this.body;
    }

}
