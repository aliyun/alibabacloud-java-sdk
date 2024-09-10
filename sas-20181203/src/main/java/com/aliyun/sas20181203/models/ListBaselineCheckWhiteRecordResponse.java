// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBaselineCheckWhiteRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaselineCheckWhiteRecordResponseBody body;

    public static ListBaselineCheckWhiteRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineCheckWhiteRecordResponse self = new ListBaselineCheckWhiteRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListBaselineCheckWhiteRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaselineCheckWhiteRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaselineCheckWhiteRecordResponse setBody(ListBaselineCheckWhiteRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaselineCheckWhiteRecordResponseBody getBody() {
        return this.body;
    }

}
