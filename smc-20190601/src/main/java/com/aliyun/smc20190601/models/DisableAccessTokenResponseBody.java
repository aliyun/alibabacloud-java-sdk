// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DisableAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>686BB8A6-BBA5-47E5-8A75-D2ADE433****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAccessTokenResponseBody self = new DisableAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
