// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateGroupSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static CreateGroupSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupSignResponseBody self = new CreateGroupSignResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupSignResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
