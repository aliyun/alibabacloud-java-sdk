// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshEditionPartiallyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeMeshEditionPartiallyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshEditionPartiallyResponseBody self = new UpgradeMeshEditionPartiallyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshEditionPartiallyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
