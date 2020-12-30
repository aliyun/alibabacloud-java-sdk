// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVehicleDashboardResponseBody body;

    public static RecognizeVehicleDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardResponse self = new RecognizeVehicleDashboardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleDashboardResponse setBody(RecognizeVehicleDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleDashboardResponseBody getBody() {
        return this.body;
    }

}
