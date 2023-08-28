// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVpcAuthModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeResponseBody self = new ModifyInstanceVpcAuthModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
