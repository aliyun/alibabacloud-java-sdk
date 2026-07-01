// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeployDeploymentDraftResultResponseBody extends TeaModel {
    /**
     * <p>The deployment result of the job draft.</p>
     */
    @NameInMap("data")
    public AsyncDraftDeployResult data;

    /**
     * <ul>
     * <li><p>The error code. This parameter is returned when the request fails.</p>
     * </li>
     * <li><p>If the request is successful, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <ul>
     * <li><p>The error message. This parameter is returned when the request fails.</p>
     * </li>
     * <li><p>If the request is successful, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. A value other than 200 indicates that the request failed.</p>
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

    public static GetDeployDeploymentDraftResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDeploymentDraftResultResponseBody self = new GetDeployDeploymentDraftResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeployDeploymentDraftResultResponseBody setData(AsyncDraftDeployResult data) {
        this.data = data;
        return this;
    }
    public AsyncDraftDeployResult getData() {
        return this.data;
    }

    public GetDeployDeploymentDraftResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeployDeploymentDraftResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeployDeploymentDraftResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDeployDeploymentDraftResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeployDeploymentDraftResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
