// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class RemoveStandbyInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveStandbyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveStandbyInstanceResponseBody self = new RemoveStandbyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveStandbyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
