// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageBuildRiskItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageBuildRiskItemResponseBody body;

    public static ListImageBuildRiskItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageBuildRiskItemResponse self = new ListImageBuildRiskItemResponse();
        return TeaModel.build(map, self);
    }

    public ListImageBuildRiskItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageBuildRiskItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageBuildRiskItemResponse setBody(ListImageBuildRiskItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageBuildRiskItemResponseBody getBody() {
        return this.body;
    }

}
