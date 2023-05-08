// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetResponseBody extends TeaModel {
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
