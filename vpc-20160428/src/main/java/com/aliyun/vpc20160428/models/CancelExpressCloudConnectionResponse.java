// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelExpressCloudConnectionResponse self = new CancelExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CancelExpressCloudConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
