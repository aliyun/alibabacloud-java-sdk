// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasDiagnosisEmergencyoftaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasDiagnosisEmergencyoftaskResponseBody body;

    public static ListHasDiagnosisEmergencyoftaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasDiagnosisEmergencyoftaskResponse self = new ListHasDiagnosisEmergencyoftaskResponse();
        return TeaModel.build(map, self);
    }

    public ListHasDiagnosisEmergencyoftaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasDiagnosisEmergencyoftaskResponse setBody(ListHasDiagnosisEmergencyoftaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasDiagnosisEmergencyoftaskResponseBody getBody() {
        return this.body;
    }

}
