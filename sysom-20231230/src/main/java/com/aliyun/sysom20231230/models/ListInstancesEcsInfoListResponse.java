// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstancesEcsInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesEcsInfoListResponseBody body;

    public static ListInstancesEcsInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesEcsInfoListResponse self = new ListInstancesEcsInfoListResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesEcsInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesEcsInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesEcsInfoListResponse setBody(ListInstancesEcsInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesEcsInfoListResponseBody getBody() {
        return this.body;
    }

}
