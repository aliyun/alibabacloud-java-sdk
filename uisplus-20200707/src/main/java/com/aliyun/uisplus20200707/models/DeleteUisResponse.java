// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteUisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteUisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisResponse self = new DeleteUisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
