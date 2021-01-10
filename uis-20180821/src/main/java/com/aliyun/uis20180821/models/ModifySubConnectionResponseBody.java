// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifySubConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySubConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySubConnectionResponseBody self = new ModifySubConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySubConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
