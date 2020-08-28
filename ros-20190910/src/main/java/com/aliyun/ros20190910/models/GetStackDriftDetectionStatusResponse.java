// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DriftDetectionId")
    @Validation(required = true)
    public String driftDetectionId;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("DriftDetectionStatus")
    @Validation(required = true)
    public String driftDetectionStatus;

    @NameInMap("DriftDetectionStatusReason")
    @Validation(required = true)
    public String driftDetectionStatusReason;

    @NameInMap("StackDriftStatus")
    @Validation(required = true)
    public String stackDriftStatus;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("DriftedStackResourceCount")
    @Validation(required = true)
    public Integer driftedStackResourceCount;

    public static GetStackDriftDetectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusResponse self = new GetStackDriftDetectionStatusResponse();
        return TeaModel.build(map, self);
    }

}
