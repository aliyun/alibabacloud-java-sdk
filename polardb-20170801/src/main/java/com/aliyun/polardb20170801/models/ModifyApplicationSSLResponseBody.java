// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationSSLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApplicationSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSSLResponseBody self = new ModifyApplicationSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
