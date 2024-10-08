// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class CreateFilterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEF1EE1F-50F6-5494-B3DA-8F597DEB31BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFilterResponseBody self = new CreateFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
