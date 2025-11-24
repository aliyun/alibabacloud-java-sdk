// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateWaypointResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>71680038-8009-5073-B43E-C057E9******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWaypointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaypointResponseBody self = new UpdateWaypointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWaypointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
