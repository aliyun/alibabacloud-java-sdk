// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountRmsAlertrecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountRmsAlertrecordsResponseBody body;

    public static CountRmsAlertrecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountRmsAlertrecordsResponse self = new CountRmsAlertrecordsResponse();
        return TeaModel.build(map, self);
    }

    public CountRmsAlertrecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountRmsAlertrecordsResponse setBody(CountRmsAlertrecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountRmsAlertrecordsResponseBody getBody() {
        return this.body;
    }

}
