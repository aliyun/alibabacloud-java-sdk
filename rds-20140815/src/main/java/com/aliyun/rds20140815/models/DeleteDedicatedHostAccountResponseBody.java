// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDedicatedHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostAccountResponseBody self = new DeleteDedicatedHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
