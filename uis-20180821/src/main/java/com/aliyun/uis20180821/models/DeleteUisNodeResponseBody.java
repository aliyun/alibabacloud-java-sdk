// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNodeResponseBody self = new DeleteUisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
