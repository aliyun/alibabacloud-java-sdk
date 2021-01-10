// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktDynamiccustomfieldoptionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    public static ListLinkeLinktDynamiccustomfieldoptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktDynamiccustomfieldoptionsResponseBody self = new ListLinkeLinktDynamiccustomfieldoptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktDynamiccustomfieldoptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktDynamiccustomfieldoptionsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

}
