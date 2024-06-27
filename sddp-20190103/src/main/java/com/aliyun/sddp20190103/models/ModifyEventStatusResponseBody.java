// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8491DBFD-48C0-4E11-B6FC-6F38921244A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyEventStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventStatusResponseBody self = new ModifyEventStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyEventStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
