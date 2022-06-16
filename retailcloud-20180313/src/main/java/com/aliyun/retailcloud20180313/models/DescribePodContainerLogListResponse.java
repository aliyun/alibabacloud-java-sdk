// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodContainerLogListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePodContainerLogListResponseBody body;

    public static DescribePodContainerLogListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePodContainerLogListResponse self = new DescribePodContainerLogListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePodContainerLogListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePodContainerLogListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePodContainerLogListResponse setBody(DescribePodContainerLogListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePodContainerLogListResponseBody getBody() {
        return this.body;
    }

}
