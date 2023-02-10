// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTagWithUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidResponseBody self = new ModifyTagWithUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
