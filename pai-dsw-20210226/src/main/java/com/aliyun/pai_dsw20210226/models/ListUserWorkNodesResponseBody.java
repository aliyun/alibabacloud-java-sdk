// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListUserWorkNodesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserWorkNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserWorkNodesResponseBody self = new ListUserWorkNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserWorkNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
