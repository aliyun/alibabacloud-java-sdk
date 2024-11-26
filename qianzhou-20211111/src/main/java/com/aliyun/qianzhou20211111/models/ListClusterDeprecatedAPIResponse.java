// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterDeprecatedAPIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterDeprecatedAPIResponseBody body;

    public static ListClusterDeprecatedAPIResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterDeprecatedAPIResponse self = new ListClusterDeprecatedAPIResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterDeprecatedAPIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterDeprecatedAPIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterDeprecatedAPIResponse setBody(ListClusterDeprecatedAPIResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterDeprecatedAPIResponseBody getBody() {
        return this.body;
    }

}
