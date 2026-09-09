// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody self = new UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
