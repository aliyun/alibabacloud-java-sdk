// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHybridProxyClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDCB0BBB-CFB2-5D38-BB49-500E2A21xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHybridProxyClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridProxyClusterResponseBody self = new CreateHybridProxyClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHybridProxyClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
