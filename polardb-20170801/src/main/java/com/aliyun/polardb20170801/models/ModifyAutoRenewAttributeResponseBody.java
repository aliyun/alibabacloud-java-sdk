// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4CE6DF97-AEA4-484F-906F-C407EE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoRenewAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponseBody self = new ModifyAutoRenewAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
