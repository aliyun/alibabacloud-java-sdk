// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DeleteTemplatesResponseBody extends TeaModel {
    // 删除条数
    @NameInMap("Data")
    public Long data;

    // 错误信息
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // exStack
    @NameInMap("ExStack")
    public String exStack;

    @NameInMap("RequestId")
    public String requestId;

    // 接口调用是否成功
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static DeleteTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplatesResponseBody self = new DeleteTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTemplatesResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public DeleteTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteTemplatesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public DeleteTemplatesResponseBody setExStack(String exStack) {
        this.exStack = exStack;
        return this;
    }
    public String getExStack() {
        return this.exStack;
    }

    public DeleteTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteTemplatesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
