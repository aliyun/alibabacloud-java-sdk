// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteUserClusterHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserClusterHostResponseBody self = new DeleteUserClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
