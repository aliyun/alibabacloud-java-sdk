// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateWaypointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71680038-8009-5073-B43E-C057E9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWaypointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWaypointResponseBody self = new CreateWaypointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWaypointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
