// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAccessKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyResponseBody self = new UpdateAccessKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
