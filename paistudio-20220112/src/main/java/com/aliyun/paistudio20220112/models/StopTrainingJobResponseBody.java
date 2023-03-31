// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class StopTrainingJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopTrainingJobResponseBody self = new StopTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
