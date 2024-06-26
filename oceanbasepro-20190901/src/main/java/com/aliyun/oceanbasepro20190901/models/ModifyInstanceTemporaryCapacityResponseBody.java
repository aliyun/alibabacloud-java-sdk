// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTemporaryCapacityResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTemporaryCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTemporaryCapacityResponseBody self = new ModifyInstanceTemporaryCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTemporaryCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
