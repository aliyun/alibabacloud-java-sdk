// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUisConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisConnectionResponseBody self = new DeleteUisConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUisConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
