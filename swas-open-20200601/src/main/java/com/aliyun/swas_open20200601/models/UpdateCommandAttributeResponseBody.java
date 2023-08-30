// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateCommandAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCommandAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommandAttributeResponseBody self = new UpdateCommandAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCommandAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
