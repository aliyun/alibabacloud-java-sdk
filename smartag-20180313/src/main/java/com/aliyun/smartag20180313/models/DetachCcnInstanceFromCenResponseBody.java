// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachCcnInstanceFromCenResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>96AF7326-B6DE-4188-8638-56A6164F62D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachCcnInstanceFromCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachCcnInstanceFromCenResponseBody self = new DetachCcnInstanceFromCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachCcnInstanceFromCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
