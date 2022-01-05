// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class AddStreamGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddStreamGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStreamGroupResponseBody self = new AddStreamGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStreamGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
