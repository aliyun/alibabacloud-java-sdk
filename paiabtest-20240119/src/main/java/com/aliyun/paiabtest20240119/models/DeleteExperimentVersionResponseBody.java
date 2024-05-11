// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteExperimentVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExperimentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentVersionResponseBody self = new DeleteExperimentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
