// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ContinueDeployApplicationGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ContinueDeployApplicationGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployApplicationGroupResponseBody self = new ContinueDeployApplicationGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueDeployApplicationGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
