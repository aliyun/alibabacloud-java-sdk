// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetMaxAttemptsPerDayResponseBody extends TeaModel {
    /**
     * <p>The status code of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of redial attempts after a call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxAttemptsPerDay")
    public Integer maxAttemptsPerDay;

    /**
     * <p>The message returned for the API.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMaxAttemptsPerDayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaxAttemptsPerDayResponseBody self = new GetMaxAttemptsPerDayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaxAttemptsPerDayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMaxAttemptsPerDayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMaxAttemptsPerDayResponseBody setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
        this.maxAttemptsPerDay = maxAttemptsPerDay;
        return this;
    }
    public Integer getMaxAttemptsPerDay() {
        return this.maxAttemptsPerDay;
    }

    public GetMaxAttemptsPerDayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMaxAttemptsPerDayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMaxAttemptsPerDayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
