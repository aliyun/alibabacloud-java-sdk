// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagUserDnsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagUserDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagUserDnsResponseBody self = new ModifySagUserDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagUserDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
