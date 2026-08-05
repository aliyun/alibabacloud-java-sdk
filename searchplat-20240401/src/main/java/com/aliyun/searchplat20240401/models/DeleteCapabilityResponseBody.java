// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteCapabilityResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CC54C38-D721-4C55-A410-2A94B5A6BE0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    public static DeleteCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCapabilityResponseBody self = new DeleteCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCapabilityResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public DeleteCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCapabilityResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
