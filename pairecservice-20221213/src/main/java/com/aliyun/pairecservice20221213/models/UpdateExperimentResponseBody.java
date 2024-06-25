// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A760D972-1475-58C0-BBB3-92B5FB08904F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentResponseBody self = new UpdateExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
