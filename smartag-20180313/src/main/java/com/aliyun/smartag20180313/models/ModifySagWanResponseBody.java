// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagWanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagWanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagWanResponseBody self = new ModifySagWanResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagWanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
