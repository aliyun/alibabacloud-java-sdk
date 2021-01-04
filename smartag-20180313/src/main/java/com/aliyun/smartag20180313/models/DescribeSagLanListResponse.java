// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagLanListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagLanListResponseBody body;

    public static DescribeSagLanListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagLanListResponse self = new DescribeSagLanListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagLanListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagLanListResponse setBody(DescribeSagLanListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagLanListResponseBody getBody() {
        return this.body;
    }

}
