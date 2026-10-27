// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>38597320-A990-5444-9A4C-7A1269610C2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVulTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetResponseBody self = new ModifyVulTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
