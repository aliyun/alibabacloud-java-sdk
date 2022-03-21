// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UpdateResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceTypeResponseBody self = new UpdateResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
