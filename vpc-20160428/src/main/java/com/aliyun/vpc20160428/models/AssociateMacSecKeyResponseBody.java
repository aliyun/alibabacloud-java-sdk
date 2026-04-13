// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateMacSecKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D32B3C26-6C6C-4988-93E9-D2A6444CE6AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateMacSecKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateMacSecKeyResponseBody self = new AssociateMacSecKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateMacSecKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
