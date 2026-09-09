// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeUmodelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDigitalEmployeeUmodelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeUmodelResponseBody self = new UpdateDigitalEmployeeUmodelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeUmodelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
