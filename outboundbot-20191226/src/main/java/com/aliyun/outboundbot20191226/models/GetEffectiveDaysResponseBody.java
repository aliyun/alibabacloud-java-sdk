// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetEffectiveDaysResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("EffectiveDays")
    public Integer effectiveDays;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetEffectiveDaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEffectiveDaysResponseBody self = new GetEffectiveDaysResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEffectiveDaysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEffectiveDaysResponseBody setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
        return this;
    }
    public Integer getEffectiveDays() {
        return this.effectiveDays;
    }

    public GetEffectiveDaysResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEffectiveDaysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEffectiveDaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEffectiveDaysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
