// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesTrafficPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesTrafficPackagesResponseBody body;

    public static ListInstancesTrafficPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesTrafficPackagesResponse self = new ListInstancesTrafficPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesTrafficPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesTrafficPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesTrafficPackagesResponse setBody(ListInstancesTrafficPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesTrafficPackagesResponseBody getBody() {
        return this.body;
    }

}
