// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetEmptyNumberNoMoreCallsInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EmptyNumberNoMoreCalls")
    public Boolean emptyNumberNoMoreCalls;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEmptyNumberNoMoreCallsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmptyNumberNoMoreCallsInfoResponseBody self = new GetEmptyNumberNoMoreCallsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setEmptyNumberNoMoreCalls(Boolean emptyNumberNoMoreCalls) {
        this.emptyNumberNoMoreCalls = emptyNumberNoMoreCalls;
        return this;
    }
    public Boolean getEmptyNumberNoMoreCalls() {
        return this.emptyNumberNoMoreCalls;
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmptyNumberNoMoreCallsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
