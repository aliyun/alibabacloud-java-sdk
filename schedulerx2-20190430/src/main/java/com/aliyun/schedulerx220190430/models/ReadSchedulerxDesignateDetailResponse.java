// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxDesignateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadSchedulerxDesignateDetailResponseBody body;

    public static ReadSchedulerxDesignateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxDesignateDetailResponse self = new ReadSchedulerxDesignateDetailResponse();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxDesignateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadSchedulerxDesignateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadSchedulerxDesignateDetailResponse setBody(ReadSchedulerxDesignateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadSchedulerxDesignateDetailResponseBody getBody() {
        return this.body;
    }

}
