// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateTrafficMirrorSessionAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64DCAF03-E2C7-479A-ACEA-38B79876B006</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrafficMirrorSessionAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficMirrorSessionAttributeResponseBody self = new UpdateTrafficMirrorSessionAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficMirrorSessionAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
