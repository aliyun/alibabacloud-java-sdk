// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryResponse self = new DeleteSnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnatEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
