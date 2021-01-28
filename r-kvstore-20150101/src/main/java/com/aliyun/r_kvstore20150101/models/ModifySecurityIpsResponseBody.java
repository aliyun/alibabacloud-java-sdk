// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsResponseBody self = new ModifySecurityIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
