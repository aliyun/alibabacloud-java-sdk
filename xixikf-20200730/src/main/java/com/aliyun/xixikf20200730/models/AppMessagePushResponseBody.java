// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class AppMessagePushResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 返回数据
    @NameInMap("Data")
    public String data;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 通信码
    @NameInMap("Success")
    public Boolean success;

    public static AppMessagePushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppMessagePushResponseBody self = new AppMessagePushResponseBody();
        return TeaModel.build(map, self);
    }

    public AppMessagePushResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppMessagePushResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AppMessagePushResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppMessagePushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AppMessagePushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
