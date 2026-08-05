// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateCapabilityResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Long httpCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5950143C-B8F0-5758-A08A-66F302FD587F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The request status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCapabilityResponseBody self = new UpdateCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCapabilityResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public UpdateCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCapabilityResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
