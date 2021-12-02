// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateCrossBoarderStatusResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // 请求的唯一标识
    @NameInMap("RequestId")
    public String requestId;

    // 是否操作成功
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCrossBoarderStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBoarderStatusResponseBody self = new UpdateCrossBoarderStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBoarderStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateCrossBoarderStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCrossBoarderStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCrossBoarderStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
