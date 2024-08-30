// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteTrainingJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4cc83062-9bcb-4ab3-979e-2e571a35834f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainingJobResponseBody self = new DeleteTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
