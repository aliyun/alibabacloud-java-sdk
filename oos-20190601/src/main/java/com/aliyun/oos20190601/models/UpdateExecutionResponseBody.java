// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C8345E88-5334-469E-901D-F912C8CB9C55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExecutionResponseBody self = new UpdateExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
