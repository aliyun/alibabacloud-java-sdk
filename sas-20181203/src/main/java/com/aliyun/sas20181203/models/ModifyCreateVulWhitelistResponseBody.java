// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCreateVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCreateVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCreateVulWhitelistResponseBody self = new ModifyCreateVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCreateVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
