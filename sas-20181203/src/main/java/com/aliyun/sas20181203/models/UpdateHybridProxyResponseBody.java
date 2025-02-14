// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHybridProxyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0DD0616-0DA0-5450-B89E-F30D49E63D6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHybridProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHybridProxyResponseBody self = new UpdateHybridProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHybridProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
