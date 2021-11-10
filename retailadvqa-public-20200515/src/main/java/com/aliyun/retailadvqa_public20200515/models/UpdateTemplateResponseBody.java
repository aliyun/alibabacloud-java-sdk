// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    // 修改记录条数
    @NameInMap("Data")
    public String data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateTemplateResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateTemplateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
