// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentsByLabelResponseBody extends TeaModel {
    /**
     * <p>The details of the deployed jobs.</p>
     */
    @NameInMap("data")
    public java.util.List<Deployment> data;

    /**
     * <p>The error code. This parameter is returned only if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message. This parameter is returned only if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. A value of 200 is returned for a successful request. To determine whether an API call is successful, check the \<code>success\\</code> parameter.</p>
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

    public static GetDeploymentsByLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentsByLabelResponseBody self = new GetDeploymentsByLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentsByLabelResponseBody setData(java.util.List<Deployment> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Deployment> getData() {
        return this.data;
    }

    public GetDeploymentsByLabelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentsByLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentsByLabelResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetDeploymentsByLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentsByLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
