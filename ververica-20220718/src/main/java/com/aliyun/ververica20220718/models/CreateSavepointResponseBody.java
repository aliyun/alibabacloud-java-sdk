// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSavepointResponseBody extends TeaModel {
    /**
     * <ul>
     * <li>If the value of success was true, the savepoint that was created was returned.</li>
     * <li>If the value of success was false, a null value was returned.</li>
     * </ul>
     */
    @NameInMap("data")
    public Savepoint data;

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
     * <p>The value was fixed to 200.</p>
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

    public static CreateSavepointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointResponseBody self = new CreateSavepointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavepointResponseBody setData(Savepoint data) {
        this.data = data;
        return this;
    }
    public Savepoint getData() {
        return this.data;
    }

    public CreateSavepointResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateSavepointResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateSavepointResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateSavepointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSavepointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
