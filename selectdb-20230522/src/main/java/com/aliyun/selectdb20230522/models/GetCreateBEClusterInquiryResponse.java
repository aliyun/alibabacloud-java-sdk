// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetCreateBEClusterInquiryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCreateBEClusterInquiryResponseBody body;

    public static GetCreateBEClusterInquiryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateBEClusterInquiryResponse self = new GetCreateBEClusterInquiryResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateBEClusterInquiryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateBEClusterInquiryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateBEClusterInquiryResponse setBody(GetCreateBEClusterInquiryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateBEClusterInquiryResponseBody getBody() {
        return this.body;
    }

}
