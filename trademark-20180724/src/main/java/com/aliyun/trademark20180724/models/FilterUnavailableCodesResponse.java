// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class FilterUnavailableCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FilterUnavailableCodesResponseBody body;

    public static FilterUnavailableCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        FilterUnavailableCodesResponse self = new FilterUnavailableCodesResponse();
        return TeaModel.build(map, self);
    }

    public FilterUnavailableCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FilterUnavailableCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FilterUnavailableCodesResponse setBody(FilterUnavailableCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public FilterUnavailableCodesResponseBody getBody() {
        return this.body;
    }

}
