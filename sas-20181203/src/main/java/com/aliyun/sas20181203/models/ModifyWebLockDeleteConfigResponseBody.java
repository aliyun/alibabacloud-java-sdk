// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockDeleteConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockDeleteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockDeleteConfigResponseBody self = new ModifyWebLockDeleteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockDeleteConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
