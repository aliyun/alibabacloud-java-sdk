// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkSearchForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrademarkSearchForInnerResponseBody body;

    public static ListTrademarkSearchForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSearchForInnerResponse self = new ListTrademarkSearchForInnerResponse();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSearchForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrademarkSearchForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrademarkSearchForInnerResponse setBody(ListTrademarkSearchForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrademarkSearchForInnerResponseBody getBody() {
        return this.body;
    }

}
