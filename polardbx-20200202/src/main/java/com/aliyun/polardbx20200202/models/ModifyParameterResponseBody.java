// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyParameterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterResponseBody self = new ModifyParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
