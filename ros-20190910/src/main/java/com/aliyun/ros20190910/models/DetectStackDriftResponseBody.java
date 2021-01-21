// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    public static DetectStackDriftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftResponseBody self = new DetectStackDriftResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectStackDriftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectStackDriftResponseBody setDriftDetectionId(String driftDetectionId) {
        this.driftDetectionId = driftDetectionId;
        return this;
    }
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

}
