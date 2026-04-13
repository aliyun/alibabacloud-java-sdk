// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisassociateMacSecKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D32B3C26-6C6C-4988-93E9-D2A6444CE6AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateMacSecKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMacSecKeyResponseBody self = new DisassociateMacSecKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateMacSecKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
