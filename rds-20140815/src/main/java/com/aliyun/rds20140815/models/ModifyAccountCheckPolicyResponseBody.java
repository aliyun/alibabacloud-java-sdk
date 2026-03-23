// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountCheckPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountCheckPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountCheckPolicyResponseBody self = new ModifyAccountCheckPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountCheckPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
