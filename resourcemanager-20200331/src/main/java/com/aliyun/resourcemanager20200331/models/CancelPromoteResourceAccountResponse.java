// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelPromoteResourceAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CancelPromoteResourceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPromoteResourceAccountResponse self = new CancelPromoteResourceAccountResponse();
        return TeaModel.build(map, self);
    }

    public CancelPromoteResourceAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
