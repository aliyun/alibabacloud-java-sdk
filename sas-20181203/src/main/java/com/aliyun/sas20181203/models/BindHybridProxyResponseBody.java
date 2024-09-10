// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindHybridProxyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11C96623-E106-59C9-866D-A6C82911459F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindHybridProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindHybridProxyResponseBody self = new BindHybridProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public BindHybridProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
