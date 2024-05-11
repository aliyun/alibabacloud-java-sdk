// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateExperimentVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExperimentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentVersionResponseBody self = new UpdateExperimentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
