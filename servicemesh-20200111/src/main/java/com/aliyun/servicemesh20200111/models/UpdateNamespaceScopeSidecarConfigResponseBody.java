// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateNamespaceScopeSidecarConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNamespaceScopeSidecarConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceScopeSidecarConfigResponseBody self = new UpdateNamespaceScopeSidecarConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceScopeSidecarConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
