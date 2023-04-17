// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CopyProductResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CopyProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyProductResponseBody self = new CopyProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
