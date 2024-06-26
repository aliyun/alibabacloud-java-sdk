// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>147CAC09-E8C6-43F8-9599-982A43D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupConfigurationResponseBody self = new ModifySecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
