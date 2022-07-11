// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteAgingResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 返回信息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功标示
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAgingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgingResponseBody self = new DeleteAgingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAgingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAgingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAgingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
