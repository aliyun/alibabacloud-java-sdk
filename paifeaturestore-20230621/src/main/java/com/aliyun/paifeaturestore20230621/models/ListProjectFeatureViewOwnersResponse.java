// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewOwnersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectFeatureViewOwnersResponseBody body;

    public static ListProjectFeatureViewOwnersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewOwnersResponse self = new ListProjectFeatureViewOwnersResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewOwnersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectFeatureViewOwnersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectFeatureViewOwnersResponse setBody(ListProjectFeatureViewOwnersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectFeatureViewOwnersResponseBody getBody() {
        return this.body;
    }

}
