// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishGraySwitchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231A8A81-CBB4-5AB3-A624-98A501******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePublishGraySwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishGraySwitchResponseBody self = new UpdatePublishGraySwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublishGraySwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
