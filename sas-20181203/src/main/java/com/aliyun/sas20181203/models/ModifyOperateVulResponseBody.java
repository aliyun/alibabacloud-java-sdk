// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOperateVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponseBody self = new ModifyOperateVulResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
