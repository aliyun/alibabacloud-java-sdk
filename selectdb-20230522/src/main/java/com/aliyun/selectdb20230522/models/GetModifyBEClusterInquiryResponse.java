// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class GetModifyBEClusterInquiryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModifyBEClusterInquiryResponseBody body;

    public static GetModifyBEClusterInquiryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModifyBEClusterInquiryResponse self = new GetModifyBEClusterInquiryResponse();
        return TeaModel.build(map, self);
    }

    public GetModifyBEClusterInquiryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModifyBEClusterInquiryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModifyBEClusterInquiryResponse setBody(GetModifyBEClusterInquiryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModifyBEClusterInquiryResponseBody getBody() {
        return this.body;
    }

}
