// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateConnDataResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    public static UpdateConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnDataResponseBody self = new UpdateConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateConnDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConnDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
