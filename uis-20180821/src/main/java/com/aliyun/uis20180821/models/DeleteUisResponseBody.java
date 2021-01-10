// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisResponseBody self = new DeleteUisResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
