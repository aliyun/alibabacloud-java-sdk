// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmDissentOriginalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConfirmDissentOriginalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDissentOriginalResponseBody self = new ConfirmDissentOriginalResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmDissentOriginalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
