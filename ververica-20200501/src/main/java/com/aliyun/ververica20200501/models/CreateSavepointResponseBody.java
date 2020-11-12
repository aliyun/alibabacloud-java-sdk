// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateSavepointResponseBody extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static CreateSavepointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointResponseBody self = new CreateSavepointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSavepointResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSavepointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
