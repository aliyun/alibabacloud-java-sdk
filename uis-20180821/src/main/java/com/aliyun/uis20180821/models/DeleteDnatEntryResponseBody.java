// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteDnatEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnatEntryResponseBody self = new DeleteDnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
