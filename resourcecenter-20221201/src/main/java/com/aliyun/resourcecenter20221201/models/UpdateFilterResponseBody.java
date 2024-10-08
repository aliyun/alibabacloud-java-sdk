// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateFilterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C5CDBF6-4DB7-53E9-ADDC-5919E3FACF6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFilterResponseBody self = new UpdateFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
