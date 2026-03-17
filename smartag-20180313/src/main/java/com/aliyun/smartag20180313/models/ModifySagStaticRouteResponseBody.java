// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagStaticRouteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ACA5A9FE-77FA-4C09-980B-5C353160FA4A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagStaticRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagStaticRouteResponseBody self = new ModifySagStaticRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagStaticRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
