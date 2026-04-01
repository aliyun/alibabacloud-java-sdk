// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCImageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8D78AED-5050-113C-A46E-7B346*******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRCImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRCImageResponseBody self = new CreateRCImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRCImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
