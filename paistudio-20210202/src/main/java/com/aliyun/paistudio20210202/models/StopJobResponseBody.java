// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class StopJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>431C53C4-BDD0-588F-8081-4437B00852B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobResponseBody self = new StopJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
