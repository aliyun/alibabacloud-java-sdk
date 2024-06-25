// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class SetHdMonitorRegionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetHdMonitorRegionConfigResponseBody body;

    public static SetHdMonitorRegionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetHdMonitorRegionConfigResponse self = new SetHdMonitorRegionConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetHdMonitorRegionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetHdMonitorRegionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetHdMonitorRegionConfigResponse setBody(SetHdMonitorRegionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetHdMonitorRegionConfigResponseBody getBody() {
        return this.body;
    }

}
