// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>488F046B-63D2-5D96-9A70-E00C3685D49F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateControlPlaneLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogConfigResponseBody self = new UpdateControlPlaneLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
