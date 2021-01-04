// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyACLResponseBody self = new ModifyACLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
