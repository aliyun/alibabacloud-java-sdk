// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CancelPromoteResourceAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelPromoteResourceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelPromoteResourceAccountResponseBody self = new CancelPromoteResourceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelPromoteResourceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
