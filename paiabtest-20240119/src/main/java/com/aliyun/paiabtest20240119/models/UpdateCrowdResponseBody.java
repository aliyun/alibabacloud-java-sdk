// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateCrowdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrowdResponseBody self = new UpdateCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
