// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateSavedQueryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D696E6EF-3A6D-5770-801E-4982081FE4D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSavedQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSavedQueryResponseBody self = new UpdateSavedQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSavedQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
