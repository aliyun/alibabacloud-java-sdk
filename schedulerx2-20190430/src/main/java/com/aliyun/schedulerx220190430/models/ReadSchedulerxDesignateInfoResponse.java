// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxDesignateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadSchedulerxDesignateInfoResponseBody body;

    public static ReadSchedulerxDesignateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxDesignateInfoResponse self = new ReadSchedulerxDesignateInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxDesignateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadSchedulerxDesignateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadSchedulerxDesignateInfoResponse setBody(ReadSchedulerxDesignateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadSchedulerxDesignateInfoResponseBody getBody() {
        return this.body;
    }

}
