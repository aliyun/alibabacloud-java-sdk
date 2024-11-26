// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetUserClusterWarningResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GetUserClusterWarningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserClusterWarningResponseBody self = new GetUserClusterWarningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserClusterWarningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
