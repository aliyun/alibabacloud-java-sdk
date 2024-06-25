// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateLaboratoryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A04CB8C0-E74A-5E83-BC61-64D153574EC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLaboratoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLaboratoryResponseBody self = new UpdateLaboratoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLaboratoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
