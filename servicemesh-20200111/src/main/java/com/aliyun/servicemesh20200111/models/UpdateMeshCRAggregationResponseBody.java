// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshCRAggregationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMeshCRAggregationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshCRAggregationResponseBody self = new UpdateMeshCRAggregationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMeshCRAggregationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
