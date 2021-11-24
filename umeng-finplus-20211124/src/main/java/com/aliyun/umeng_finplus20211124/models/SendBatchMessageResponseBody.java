// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class SendBatchMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SendBatchMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageResponseBody self = new SendBatchMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBatchMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendBatchMessageResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SendBatchMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendBatchMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
