// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateDynamicDictResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EACE89CB-F32B-5A85-9242-D474A2ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDynamicDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicDictResponseBody self = new CreateDynamicDictResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDynamicDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
