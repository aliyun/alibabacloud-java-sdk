// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodesParametersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBNodesParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodesParametersResponseBody self = new ModifyDBNodesParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodesParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
