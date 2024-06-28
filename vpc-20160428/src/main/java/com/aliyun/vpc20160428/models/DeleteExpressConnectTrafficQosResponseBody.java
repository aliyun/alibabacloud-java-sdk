// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectTrafficQosResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExpressConnectTrafficQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectTrafficQosResponseBody self = new DeleteExpressConnectTrafficQosResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectTrafficQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
