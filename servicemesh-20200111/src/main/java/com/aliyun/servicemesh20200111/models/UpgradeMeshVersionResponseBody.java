// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeMeshVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshVersionResponseBody self = new UpgradeMeshVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
