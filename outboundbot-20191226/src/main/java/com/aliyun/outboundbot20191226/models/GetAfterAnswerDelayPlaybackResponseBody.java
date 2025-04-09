// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAfterAnswerDelayPlaybackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("AfterAnswerDelayPlayback")
    public Integer afterAnswerDelayPlayback;

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
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static GetAfterAnswerDelayPlaybackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAfterAnswerDelayPlaybackResponseBody self = new GetAfterAnswerDelayPlaybackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAfterAnswerDelayPlaybackResponseBody setAfterAnswerDelayPlayback(Integer afterAnswerDelayPlayback) {
        this.afterAnswerDelayPlayback = afterAnswerDelayPlayback;
        return this;
    }
    public Integer getAfterAnswerDelayPlayback() {
        return this.afterAnswerDelayPlayback;
    }

    public GetAfterAnswerDelayPlaybackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAfterAnswerDelayPlaybackResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAfterAnswerDelayPlaybackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAfterAnswerDelayPlaybackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAfterAnswerDelayPlaybackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
