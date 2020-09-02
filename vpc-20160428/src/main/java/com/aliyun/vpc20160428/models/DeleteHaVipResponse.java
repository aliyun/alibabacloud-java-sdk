// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteHaVipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipResponse self = new DeleteHaVipResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
