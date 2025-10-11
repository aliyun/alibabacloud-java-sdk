// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeSccModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBNodeSccModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeSccModeResponseBody self = new ModifyDBNodeSccModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeSccModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
