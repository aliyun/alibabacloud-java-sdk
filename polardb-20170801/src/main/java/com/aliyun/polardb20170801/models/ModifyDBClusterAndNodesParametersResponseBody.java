// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAndNodesParametersResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterAndNodesParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAndNodesParametersResponseBody self = new ModifyDBClusterAndNodesParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAndNodesParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
