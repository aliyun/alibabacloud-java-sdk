// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyVulTargetConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVulTargetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVulTargetConfigResponseBody self = new ModifyVulTargetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVulTargetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
