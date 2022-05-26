// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshWorkloadVersionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeshWorkloadVersionStatusResponseBody body;

    public static DescribeMeshWorkloadVersionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshWorkloadVersionStatusResponse self = new DescribeMeshWorkloadVersionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeshWorkloadVersionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeshWorkloadVersionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeshWorkloadVersionStatusResponse setBody(DescribeMeshWorkloadVersionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeshWorkloadVersionStatusResponseBody getBody() {
        return this.body;
    }

}
