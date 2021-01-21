// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteChangeSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetResponse self = new DeleteChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChangeSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
