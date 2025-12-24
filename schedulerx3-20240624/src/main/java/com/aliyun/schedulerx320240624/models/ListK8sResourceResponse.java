// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListK8sResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sResourceResponseBody body;

    public static ListK8sResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sResourceResponse self = new ListK8sResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sResourceResponse setBody(ListK8sResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sResourceResponseBody getBody() {
        return this.body;
    }

}
