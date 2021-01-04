// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class InvokeActionResponseBody extends TeaModel {
    @NameInMap("Message")
    public Integer message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public Integer code;

    public static InvokeActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionResponseBody self = new InvokeActionResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeActionResponseBody setMessage(Integer message) {
        this.message = message;
        return this;
    }
    public Integer getMessage() {
        return this.message;
    }

    public InvokeActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeActionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InvokeActionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
