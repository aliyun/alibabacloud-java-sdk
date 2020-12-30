// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20170331.models;

import com.aliyun.tea.*;

public class ExecuteRequestResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Code")
    public Integer code;

    public static ExecuteRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestResponseBody self = new ExecuteRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteRequestResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecuteRequestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
