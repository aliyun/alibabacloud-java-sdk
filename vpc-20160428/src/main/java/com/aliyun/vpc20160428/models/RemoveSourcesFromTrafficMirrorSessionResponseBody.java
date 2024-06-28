// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromTrafficMirrorSessionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A33B2C6A-89D1-4DEA-A807-A6E8CC552484</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSourcesFromTrafficMirrorSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromTrafficMirrorSessionResponseBody self = new RemoveSourcesFromTrafficMirrorSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromTrafficMirrorSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
