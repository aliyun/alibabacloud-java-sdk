// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSServiceClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddMSServiceClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMSServiceClientResponseBody self = new AddMSServiceClientResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMSServiceClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
