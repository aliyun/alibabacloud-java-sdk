// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLakebaseMountParameterTemplateListResponseBody body;

    public static DescribeLakebaseMountParameterTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterTemplateListResponse self = new DescribeLakebaseMountParameterTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLakebaseMountParameterTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLakebaseMountParameterTemplateListResponse setBody(DescribeLakebaseMountParameterTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLakebaseMountParameterTemplateListResponseBody getBody() {
        return this.body;
    }

}
