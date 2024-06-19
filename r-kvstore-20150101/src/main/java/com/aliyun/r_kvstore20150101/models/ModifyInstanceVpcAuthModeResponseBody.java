// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
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
