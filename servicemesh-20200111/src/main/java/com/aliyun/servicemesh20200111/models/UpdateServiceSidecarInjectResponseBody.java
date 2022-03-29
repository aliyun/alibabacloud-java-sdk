// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateServiceSidecarInjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceSidecarInjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceSidecarInjectResponseBody self = new UpdateServiceSidecarInjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceSidecarInjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
