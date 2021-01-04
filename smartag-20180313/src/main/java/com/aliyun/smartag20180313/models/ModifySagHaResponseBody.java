// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagHaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagHaResponseBody self = new ModifySagHaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
