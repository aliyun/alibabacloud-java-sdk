// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CheckMailRegisteredResponseBody extends TeaModel {
    @NameInMap("Registered")
    public Boolean registered;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckMailRegisteredResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMailRegisteredResponseBody self = new CheckMailRegisteredResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMailRegisteredResponseBody setRegistered(Boolean registered) {
        this.registered = registered;
        return this;
    }
    public Boolean getRegistered() {
        return this.registered;
    }

    public CheckMailRegisteredResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
