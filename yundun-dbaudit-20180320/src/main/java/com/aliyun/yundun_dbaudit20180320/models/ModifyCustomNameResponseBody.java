// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyCustomNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomNameResponseBody self = new ModifyCustomNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
