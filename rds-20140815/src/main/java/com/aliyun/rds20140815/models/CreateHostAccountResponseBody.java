// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponseBody self = new CreateHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
