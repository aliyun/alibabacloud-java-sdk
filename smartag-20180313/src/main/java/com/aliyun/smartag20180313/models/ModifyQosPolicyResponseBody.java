// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyQosPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosPolicyResponseBody self = new ModifyQosPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQosPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
