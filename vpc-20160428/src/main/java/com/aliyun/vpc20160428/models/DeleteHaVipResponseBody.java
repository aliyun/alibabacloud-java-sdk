// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteHaVipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHaVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipResponseBody self = new DeleteHaVipResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
