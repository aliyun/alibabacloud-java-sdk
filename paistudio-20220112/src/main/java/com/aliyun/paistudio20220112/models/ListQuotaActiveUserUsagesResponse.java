// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaActiveUserUsagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaActiveUserUsagesResponseBody body;

    public static ListQuotaActiveUserUsagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaActiveUserUsagesResponse self = new ListQuotaActiveUserUsagesResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaActiveUserUsagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaActiveUserUsagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaActiveUserUsagesResponse setBody(ListQuotaActiveUserUsagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaActiveUserUsagesResponseBody getBody() {
        return this.body;
    }

}
