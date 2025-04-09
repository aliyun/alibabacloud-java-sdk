// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetConcurrentConversationQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>maxConcurrent</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxConcurrent")
    public Integer maxConcurrent;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RemainingConcurrent")
    public Integer remainingConcurrent;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConcurrentConversationQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConcurrentConversationQuotaResponseBody self = new GetConcurrentConversationQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConcurrentConversationQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConcurrentConversationQuotaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConcurrentConversationQuotaResponseBody setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    public GetConcurrentConversationQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConcurrentConversationQuotaResponseBody setRemainingConcurrent(Integer remainingConcurrent) {
        this.remainingConcurrent = remainingConcurrent;
        return this;
    }
    public Integer getRemainingConcurrent() {
        return this.remainingConcurrent;
    }

    public GetConcurrentConversationQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConcurrentConversationQuotaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
