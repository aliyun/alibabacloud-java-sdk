// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsEndpointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOmsEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsEndpointsResponseBody self = new DeleteOmsEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOmsEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
