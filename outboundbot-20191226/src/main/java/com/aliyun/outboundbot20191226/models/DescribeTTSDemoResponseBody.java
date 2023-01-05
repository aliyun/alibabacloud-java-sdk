// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoResponseBody extends TeaModel {
    @NameInMap("AuditionUrl")
    public String auditionUrl;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTTSDemoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSDemoResponseBody self = new DescribeTTSDemoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTTSDemoResponseBody setAuditionUrl(String auditionUrl) {
        this.auditionUrl = auditionUrl;
        return this;
    }
    public String getAuditionUrl() {
        return this.auditionUrl;
    }

    public DescribeTTSDemoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTTSDemoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTTSDemoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTTSDemoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTTSDemoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
