// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentDraftResponseBody extends TeaModel {
    /**
     * <p>The details of the job draft.</p>
     */
    @NameInMap("data")
    public DeploymentDraft data;

    /**
     * <ul>
     * <li><p>The error code returned if the request fails.</p>
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
     * <li><p>The error message returned if the request fails.</p>
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

    public static GetDeploymentDraftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDraftResponseBody self = new GetDeploymentDraftResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDraftResponseBody setData(DeploymentDraft data) {
        this.data = data;
        return this;
    }
    public DeploymentDraft getData() {
        return this.data;
    }

    public GetDeploymentDraftResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentDraftResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentDraftResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDeploymentDraftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentDraftResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
