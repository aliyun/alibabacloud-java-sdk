// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TagResourcesForExpressConnectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesForExpressConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesForExpressConnectResponseBody self = new TagResourcesForExpressConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesForExpressConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
