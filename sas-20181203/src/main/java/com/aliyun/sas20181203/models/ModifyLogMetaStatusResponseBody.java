// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyLogMetaStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogMetaStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogMetaStatusResponseBody self = new ModifyLogMetaStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogMetaStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
