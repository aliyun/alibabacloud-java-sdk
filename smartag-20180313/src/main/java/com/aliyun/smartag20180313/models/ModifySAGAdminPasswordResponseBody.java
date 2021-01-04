// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySAGAdminPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySAGAdminPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySAGAdminPasswordResponseBody self = new ModifySAGAdminPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySAGAdminPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
