// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteBgpGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBgpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBgpGroupResponse self = new DeleteBgpGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBgpGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
