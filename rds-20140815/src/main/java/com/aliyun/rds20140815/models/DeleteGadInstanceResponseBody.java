// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteGadInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGadInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGadInstanceResponseBody self = new DeleteGadInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGadInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
