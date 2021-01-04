// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddSagCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddSagCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSagCidrResponseBody self = new AddSagCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSagCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
