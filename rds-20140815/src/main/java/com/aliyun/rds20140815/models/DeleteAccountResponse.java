// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponse self = new DeleteAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
