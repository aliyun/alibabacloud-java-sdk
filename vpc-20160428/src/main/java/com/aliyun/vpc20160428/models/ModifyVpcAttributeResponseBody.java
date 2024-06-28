// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43B72D30-25E1-4FA3-96A8-89374A521D1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAttributeResponseBody self = new ModifyVpcAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
