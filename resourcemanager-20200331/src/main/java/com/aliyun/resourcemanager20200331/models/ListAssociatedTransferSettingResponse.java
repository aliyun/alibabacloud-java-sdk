// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAssociatedTransferSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssociatedTransferSettingResponseBody body;

    public static ListAssociatedTransferSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedTransferSettingResponse self = new ListAssociatedTransferSettingResponse();
        return TeaModel.build(map, self);
    }

    public ListAssociatedTransferSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssociatedTransferSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssociatedTransferSettingResponse setBody(ListAssociatedTransferSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssociatedTransferSettingResponseBody getBody() {
        return this.body;
    }

}
