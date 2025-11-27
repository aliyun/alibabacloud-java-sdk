// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListRCVClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRCVClustersResponseBody body;

    public static ListRCVClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRCVClustersResponse self = new ListRCVClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListRCVClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRCVClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRCVClustersResponse setBody(ListRCVClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRCVClustersResponseBody getBody() {
        return this.body;
    }

}
