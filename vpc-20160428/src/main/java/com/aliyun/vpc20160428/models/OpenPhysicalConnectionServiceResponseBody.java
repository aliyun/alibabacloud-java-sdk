// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenPhysicalConnectionServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenPhysicalConnectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenPhysicalConnectionServiceResponseBody self = new OpenPhysicalConnectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenPhysicalConnectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
