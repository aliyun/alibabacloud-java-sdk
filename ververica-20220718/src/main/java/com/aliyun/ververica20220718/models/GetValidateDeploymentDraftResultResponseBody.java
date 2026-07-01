// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetValidateDeploymentDraftResultResponseBody extends TeaModel {
    /**
     * <p>The result object of the in-depth check for the job draft.</p>
     */
    @NameInMap("data")
    public AsyncDraftValidateResult data;

    /**
     * <p>If success is false, this parameter is not empty and indicates the business error code. If success is true, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>If success is false, this parameter is not empty and indicates the business error message. If success is true, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code. This is always 200. The success parameter indicates whether the business request was successful.</p>
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
     * <p>Indicates whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetValidateDeploymentDraftResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidateDeploymentDraftResultResponseBody self = new GetValidateDeploymentDraftResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidateDeploymentDraftResultResponseBody setData(AsyncDraftValidateResult data) {
        this.data = data;
        return this;
    }
    public AsyncDraftValidateResult getData() {
        return this.data;
    }

    public GetValidateDeploymentDraftResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetValidateDeploymentDraftResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetValidateDeploymentDraftResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetValidateDeploymentDraftResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetValidateDeploymentDraftResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
