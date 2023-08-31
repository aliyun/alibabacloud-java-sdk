// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateControlPlaneLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogConfigResponseBody self = new UpdateControlPlaneLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
