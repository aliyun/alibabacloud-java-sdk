// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateEventResponseBody extends TeaModel {
    @NameInMap("data")
    public Boolean data;

    @NameInMap("requestId")
    public String requestId;

    public static CreateEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventResponseBody self = new CreateEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
