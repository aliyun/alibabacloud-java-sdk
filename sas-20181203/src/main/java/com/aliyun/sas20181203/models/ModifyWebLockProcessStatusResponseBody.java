// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockProcessStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockProcessStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockProcessStatusResponseBody self = new ModifyWebLockProcessStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockProcessStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
