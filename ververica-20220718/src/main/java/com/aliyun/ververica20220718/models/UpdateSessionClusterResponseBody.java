// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateSessionClusterResponseBody extends TeaModel {
    /**
     * <p>The data structure of the updated session cluster.</p>
     */
    @NameInMap("data")
    public SessionCluster data;

    /**
     * <p>The error code returned if the request fails. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails. This parameter is empty if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. The value is always 200. Use the \<code>success\\</code> parameter to determine if the request was successful.</p>
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
     * <p>1EF03B0C-F44F-47AD-BB48-D002D0F7B8C9</p>
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

    public static UpdateSessionClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionClusterResponseBody self = new UpdateSessionClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSessionClusterResponseBody setData(SessionCluster data) {
        this.data = data;
        return this;
    }
    public SessionCluster getData() {
        return this.data;
    }

    public UpdateSessionClusterResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateSessionClusterResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateSessionClusterResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateSessionClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSessionClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
