// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetClusterWarningResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GetClusterWarningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterWarningResponseBody self = new GetClusterWarningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterWarningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
