// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class UpdateFilterResponseBody extends TeaModel {
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
