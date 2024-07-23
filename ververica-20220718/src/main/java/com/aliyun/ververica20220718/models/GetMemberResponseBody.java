// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetMemberResponseBody extends TeaModel {
    /**
     * <ul>
     * <li>If the value of success was false, a null value was returned.</li>
     * <li>If the value of success was true, the authorization information was returned.</li>
     * </ul>
     */
    @NameInMap("data")
    public Member data;

    /**
     * <ul>
     * <li>If the value of success was false, an error code was returned.</li>
     * <li>If the value of success was true, a null value was returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li>If the value of success was false, an error message was returned.</li>
     * <li>If the value of success was true, a null value was returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The status code returned. The value was fixed to 200. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemberResponseBody self = new GetMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemberResponseBody setData(Member data) {
        this.data = data;
        return this;
    }
    public Member getData() {
        return this.data;
    }

    public GetMemberResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMemberResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMemberResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
