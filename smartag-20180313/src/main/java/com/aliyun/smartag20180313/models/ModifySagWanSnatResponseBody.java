// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWanSnatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagWanSnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWanSnatResponseBody self = new ModifySagWanSnatResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagWanSnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
