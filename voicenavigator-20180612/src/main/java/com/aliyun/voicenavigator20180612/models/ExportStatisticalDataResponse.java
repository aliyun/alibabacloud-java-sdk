// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ExportStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportStatisticalDataResponseBody body;

    public static ExportStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportStatisticalDataResponse self = new ExportStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportStatisticalDataResponse setBody(ExportStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportStatisticalDataResponseBody getBody() {
        return this.body;
    }

}
