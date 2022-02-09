// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteClogServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClogServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClogServiceResponseBody self = new DeleteClogServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClogServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
