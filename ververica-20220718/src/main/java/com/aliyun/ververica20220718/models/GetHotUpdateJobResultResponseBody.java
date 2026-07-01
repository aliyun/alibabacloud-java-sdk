// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetHotUpdateJobResultResponseBody extends TeaModel {
    /**
     * <p>The result of the dynamic update.</p>
     */
    @NameInMap("data")
    public HotUpdateJobResult data;

    /**
     * <ul>
     * <li><p>If the success parameter is false, an error code is returned.</p>
     * </li>
     * <li><p>If the success parameter is true, this parameter is empty.</p>
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
     * <li><p>If the success parameter is false, an error message is returned.</p>
     * </li>
     * <li><p>If the success parameter is true, this parameter is empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. A value of 200 is always returned. The success parameter indicates whether the request was successful.</p>
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
     * <p>CBC799F0-ABCF-1D30-8A4F-882ED4DD****</p>
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

    public static GetHotUpdateJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotUpdateJobResultResponseBody self = new GetHotUpdateJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotUpdateJobResultResponseBody setData(HotUpdateJobResult data) {
        this.data = data;
        return this;
    }
    public HotUpdateJobResult getData() {
        return this.data;
    }

    public GetHotUpdateJobResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetHotUpdateJobResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetHotUpdateJobResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetHotUpdateJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotUpdateJobResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
