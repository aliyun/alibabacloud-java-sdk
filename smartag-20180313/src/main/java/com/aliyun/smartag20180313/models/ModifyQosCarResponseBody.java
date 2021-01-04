// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyQosCarResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyQosCarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosCarResponseBody self = new ModifyQosCarResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyQosCarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
