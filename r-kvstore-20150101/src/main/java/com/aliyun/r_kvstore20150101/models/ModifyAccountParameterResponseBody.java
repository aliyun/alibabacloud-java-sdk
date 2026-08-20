// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyAccountParameterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D190D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountParameterResponseBody self = new ModifyAccountParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
