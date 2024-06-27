// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateReplenishTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static CreateReplenishTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReplenishTaskResponseBody self = new CreateReplenishTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReplenishTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateReplenishTaskResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
