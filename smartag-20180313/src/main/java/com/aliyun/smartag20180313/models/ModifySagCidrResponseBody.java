// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagCidrResponseBody self = new ModifySagCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
