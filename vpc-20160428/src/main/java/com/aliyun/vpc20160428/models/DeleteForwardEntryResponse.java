// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteForwardEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryResponse self = new DeleteForwardEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
