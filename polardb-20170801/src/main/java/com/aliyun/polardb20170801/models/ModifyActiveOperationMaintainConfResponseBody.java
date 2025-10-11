// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CC9CB4B-BBAF-5963-9545-A8DE9FFC7DFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfResponseBody self = new ModifyActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
