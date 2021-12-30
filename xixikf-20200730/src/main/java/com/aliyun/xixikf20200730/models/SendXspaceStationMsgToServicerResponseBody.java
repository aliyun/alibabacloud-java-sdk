// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SendXspaceStationMsgToServicerResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    // 请求结果数据
    @NameInMap("Data")
    public String data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求唯一ID
    @NameInMap("RequestId")
    public String requestId;

    // 处理结果
    @NameInMap("Success")
    public Boolean success;

    public static SendXspaceStationMsgToServicerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendXspaceStationMsgToServicerResponseBody self = new SendXspaceStationMsgToServicerResponseBody();
        return TeaModel.build(map, self);
    }

    public SendXspaceStationMsgToServicerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendXspaceStationMsgToServicerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendXspaceStationMsgToServicerResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendXspaceStationMsgToServicerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendXspaceStationMsgToServicerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendXspaceStationMsgToServicerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
