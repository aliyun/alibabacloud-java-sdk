// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class UpgradeProxyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B830CDBB-91D9-5571-B6F4-35C76266****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeProxyResponseBody self = new UpgradeProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
