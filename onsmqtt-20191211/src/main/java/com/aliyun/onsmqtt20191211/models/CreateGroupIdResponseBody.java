// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class CreateGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupIdResponseBody self = new CreateGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
