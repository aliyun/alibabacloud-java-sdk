// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagECRouteBackupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagECRouteBackupAttributeResponseBody body;

    public static DescribeSagECRouteBackupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagECRouteBackupAttributeResponse self = new DescribeSagECRouteBackupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagECRouteBackupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagECRouteBackupAttributeResponse setBody(DescribeSagECRouteBackupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagECRouteBackupAttributeResponseBody getBody() {
        return this.body;
    }

}
