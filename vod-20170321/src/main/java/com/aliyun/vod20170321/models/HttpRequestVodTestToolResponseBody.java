// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class HttpRequestVodTestToolResponseBody extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Header")
    public String header;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static HttpRequestVodTestToolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HttpRequestVodTestToolResponseBody self = new HttpRequestVodTestToolResponseBody();
        return TeaModel.build(map, self);
    }

    public HttpRequestVodTestToolResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public HttpRequestVodTestToolResponseBody setHeader(String header) {
        this.header = header;
        return this;
    }
    public String getHeader() {
        return this.header;
    }

    public HttpRequestVodTestToolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HttpRequestVodTestToolResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
