// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshResponseBody self = new DeleteServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
