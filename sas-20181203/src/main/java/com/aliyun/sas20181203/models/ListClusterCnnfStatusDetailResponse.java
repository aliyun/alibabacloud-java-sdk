// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCnnfStatusDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterCnnfStatusDetailResponseBody body;

    public static ListClusterCnnfStatusDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCnnfStatusDetailResponse self = new ListClusterCnnfStatusDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterCnnfStatusDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterCnnfStatusDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterCnnfStatusDetailResponse setBody(ListClusterCnnfStatusDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterCnnfStatusDetailResponseBody getBody() {
        return this.body;
    }

}
