// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhiteListResponseBody self = new ModifyWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
