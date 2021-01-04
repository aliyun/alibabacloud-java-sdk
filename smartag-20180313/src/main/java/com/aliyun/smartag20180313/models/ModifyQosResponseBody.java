// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyQosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosResponseBody self = new ModifyQosResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
